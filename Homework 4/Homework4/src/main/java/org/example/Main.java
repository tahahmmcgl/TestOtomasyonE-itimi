package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Seeds seeds = new Seeds();
        seeds.setDepartments();
        seeds.setEmployees();



        System.out.println("Enter the department name: ");
        String departmentName = scanner.nextLine();

        if (isDepartmentExist(departmentName, seeds)) {
            for (Department department : seeds.departments) {
                if (department.getName().equals(departmentName)) {
                    System.out.println("The manager of the " + departmentName + " department is " + department.getManager());
                    System.out.println("The employees are: ");
                    List<Employee> employees = getEmployeesByDepartmentName(departmentName, seeds);
                    for (Employee employee : employees) {
                        System.out.println(employee.getName());
                    }
                }
            }
        } else {
            System.out.println("The department does not exist");
        }

    }

    public static Boolean isDepartmentExist(String departmentName, Seeds seeds) {
        for (Department department : seeds.departments) {
            if (department.getName().equals(departmentName)) {
                return true;
            }
        }
        return false;
    }

    public static List<Employee> getEmployeesByDepartmentName(String departmentName, Seeds seeds) {
        List<Employee> employees = new ArrayList<>();
        for (Employee employee : seeds.employees) {
            if (employee.getDepartment().getName().equals(departmentName)) {
                employees.add(employee);
            }
        }
        return employees;
    }
}