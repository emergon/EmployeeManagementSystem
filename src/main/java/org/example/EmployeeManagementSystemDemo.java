package org.example;

public class EmployeeManagementSystemDemo {

    public static void main(String[] args) {

        // Create a ManagementSystem object
        ManagementSystem managementSystem = new ManagementSystem();

        // Create some Employee objects with the new attributes
        Employee emp1 = new Employee(101, "John Doe", "HR", 50000.0);
        Employee emp2 = new Employee(102, "Jane Smith", "Finance", 60000.0);
        Employee emp3 = new Employee(103, "Michael Johnson", "Engineering", 70000.0);

        // Add employees to the ManagementSystem
        boolean added1 = managementSystem.addEmployee(emp1);
        boolean added2 = managementSystem.addEmployee(emp2);
        boolean added3 = managementSystem.addEmployee(emp3);

        // Display if employees were added successfully
        System.out.println("Employee 1 added: " + added1);
        System.out.println("Employee 2 added: " + added2);
        System.out.println("Employee 3 added: " + added3);

        // Attempt to add a duplicate employee
        Employee duplicateEmp = new Employee(102, "Duplicate Employee", "Sales", 55000.0);
        boolean addedDuplicate = managementSystem.addEmployee(duplicateEmp);
        System.out.println("Duplicate Employee added: " + addedDuplicate); // Should be false

        // Display all employees
        managementSystem.displayAllEmployees();

        // Remove an employee by ID
        int empIdToRemove = 101;
        boolean removed = managementSystem.removeEmployee(empIdToRemove);
        System.out.println("Employee with ID " + empIdToRemove + " removed: " + removed);

        // Display all employees again after removal
        managementSystem.displayAllEmployees();

        // Find an employee by ID
        int empIdToFind = 102;
        managementSystem.findEmployeeById(empIdToFind);

        // Find an employee by an invalid ID
        int invalidEmpId = 999;
        managementSystem.findEmployeeById(invalidEmpId);

        // Sort employees by salary in ascending order
        managementSystem.sortEmployeesBySalary();

        // Display all employees after sorting by salary
        System.out.println("\nAfter sorting by salary:");
        managementSystem.displayAllEmployees();

        // Update an employee's details
        int empIdToUpdate = 102;
        String newName = "Janet Johnson";
        String newDepartment = "Marketing";
        double newSalary = 65000.0;
        boolean updated = managementSystem.updateEmployeeDetails(empIdToUpdate, newName, newDepartment, newSalary);

        if (updated) {
            System.out.println("\nEmployee details updated successfully!");
        } else {
            System.out.println("\nEmployee with ID " + empIdToUpdate + " not found. Details not updated.");
        }

        // Display all employees after updating details
        System.out.println("\nAfter updating details:");
        managementSystem.displayAllEmployees();

    }
}
