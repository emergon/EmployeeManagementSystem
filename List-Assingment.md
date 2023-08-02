# Employee Management System - List Implementation

## Description:
In this exercise, you are tasked with implementing an Employee Management System using `ArrayList` to store employee data. You will create classes to represent employees and build functionalities to add, remove, and display employee information.

## Instructions:

1. Define an `Employee` class with the following attributes:
    - Employee ID (int)
    - Name (String)
    - Department (String)
    - Salary (double)

2. Create a `ManagementSystem` class that uses an `ArrayList` to store instances of `Employee`.

3. Implement the following methods in the `ManagementSystem` class:
    - `addEmployee(Employee employee)`: Add an employee to the system.
    - `removeEmployee(int employeeId)`: Remove an employee from the system based on their ID.
    - `displayAllEmployees()`: Display the information of all employees in the system.
    - `findEmployeeById(int employeeId)`: Find and display an employee's information based on their ID.

4. Create a main program to demonstrate the functionalities of the `ManagementSystem` class.
    - Add a few employees to the system.
    - Remove an employee using their ID.
    - Display the details of all employees.
    - Search for an employee using their ID.

### Additional Challenges (Optional):

1. Implement error handling to handle cases where an employee ID does not exist or is duplicated.
2. Sort the employees based on their salary in ascending order using `Collections.sort()`.
3. Add functionality to update an employee's details (e.g., salary, department, name).

Remember to use object-oriented principles to complete the exercise.