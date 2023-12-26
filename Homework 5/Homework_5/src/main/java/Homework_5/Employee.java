package Homework_5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private String name;
    private String department;
    private int salary;

    private int workDays;
    public Employee(String name, String department, int salary, int workDays) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.workDays = workDays;
    }
}
