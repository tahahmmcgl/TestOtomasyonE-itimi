package Homework_5;

public class Main {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.create("John", "IT", 1000, 30);
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee department: " + employee.getDepartment());
        System.out.println("Employee salary: " + employee.getSalary());
        System.out.println("Employee workDays: " + employee.getWorkDays());
    }
}