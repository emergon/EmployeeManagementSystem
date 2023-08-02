package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

/**
 * The ManagementSystem class represents a system for managing employees in a company.
 */
public class ManagementSystem {

    private ArrayList<Employee> employees;

    /**
     * Constructs a new ManagementSystem object with an empty list of employees.
     */
    public ManagementSystem() {
        this.employees = new ArrayList<>();
    }

    /**
     * Adds an employee to the system.
     *
     * @param employee The Employee object to be added.
     * @return true if the employee was added successfully, false otherwise (e.g., if employee is null or already exists).
     */
    public boolean addEmployee(Employee employee) {
        if (employee == null) {
            return false;
        }

        // Check for duplicate employee ID before adding
        for (Employee existingEmployee : employees) {
            if (existingEmployee.getId() == employee.getId()) {
                return false; // Employee with same ID already exists, don't add
            }
        }

        return employees.add(employee);
    }

    /**
     * Removes an employee from the system based on their ID.
     *
     * @param employeeId The ID of the employee to be removed.
     * @return true if the employee with the specified ID was found and removed successfully, false otherwise.
     */
    public boolean removeEmployee(int employeeId) {
        Optional<Employee> employeeById = find(employeeId);
        return employeeById.isPresent() && employees.remove(employeeById.get());
    }

    /**
     * Displays the information of all employees in the system.
     */
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found in the system.");
        } else {
            System.out.println("The Company has the following employees:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    /**
     * Finds an employee based on their ID and returns the employee if found.
     *
     * @param employeeId The ID of the employee to be found.
     * @return An Optional<Employee> object containing the employee with the specified ID if found,
     *         or an empty Optional if no employee is found with the given ID.
     */
    public Optional<Employee> findEmployeeById(int employeeId) {
        Optional<Employee> optionalEmployee = find(employeeId);
        if (optionalEmployee.isPresent()) {
            System.out.println("The employee registered with the id: " + employeeId + " is " + optionalEmployee.get().getName());
        } else {
            System.out.println("No employee was found with id:" + employeeId);
        }
        return optionalEmployee;
    }

    /**
     * Private helper method to find an employee based on their ID.
     *
     * @param employeeId The ID of the employee to be found.
     * @return An Optional<Employee> object containing the employee with the specified ID if found,
     *         or an empty Optional if no employee is found with the given ID.
     */
    private Optional<Employee> find(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                return Optional.of(employee);
            }
        }
        return Optional.empty();
    }

    /**
     * Sorts the employees based on their salary in ascending order.
     * Uses Collections.sort() with a comparator based on employee salaries.
     */
    public void sortEmployeesBySalary() {
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
    }

    /**
     * Updates an employee's details (e.g., name, department, salary) based on the provided employee ID.
     *
     * @param employeeId The ID of the employee to update.
     * @param newName The new name to set for the employee.
     * @param newDepartment The new department to set for the employee.
     * @param newSalary The new salary to set for the employee.
     * @return true if the employee was found and details were updated successfully, false otherwise.
     */
    public boolean updateEmployeeDetails(int employeeId, String newName, String newDepartment, double newSalary) {
        Optional<Employee> optionalEmployee = find(employeeId);
        if (optionalEmployee.isPresent()) {
            Employee employeeToUpdate = optionalEmployee.get();
            employeeToUpdate.setName(newName);
            employeeToUpdate.setDepartment(newDepartment);
            employeeToUpdate.setSalary(newSalary);
            return true;
        } else {
            return false;
        }
    }
}
