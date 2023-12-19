package org.example;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

public class Seeds {

    public Department[] departments;
    public Employee[] employees;

    public Seeds() {
        this.departments = new Department[3];
        this.employees = new Employee[15];

    }

    public void setEmployees(){
        employees[0] = new Employee("John", 32, "London", departments[0]);
        employees[1] = new Employee("Mary", 25, "London", departments[1]);
        employees[2] = new Employee("Mike", 28, "London", departments[2]);
        employees[3] = new Employee("Jane", 30, "London", departments[0]);
        employees[4] = new Employee("Bob", 35, "London", departments[1]);
        employees[5] = new Employee("June", 40, "London", departments[2]);
        employees[6] = new Employee("Tom", 45, "London", departments[0]);
        employees[7] = new Employee("Tim", 50, "London", departments[1]);
        employees[8] = new Employee("Tina", 55, "London", departments[2]);
        employees[9] = new Employee("Terry", 60, "London", departments[0]);
        employees[10] = new Employee("Trevor", 65, "London", departments[1]);
        employees[11] = new Employee("Terry", 70, "London", departments[2]);
        employees[12] = new Employee("Trevor", 75, "London", departments[0]);
        employees[13] = new Employee("Terry", 80, "London", departments[1]);
        employees[14] = new Employee("Trevor", 85, "London", departments[2]);

    }
    public void setDepartments(){
        departments[0] = new Department("Sales", "London", "John", employees);
        departments[1] = new Department("HR", "London", "Mary", employees);
        departments[2] = new Department("IT", "London", "Mike", employees);
    }


}
