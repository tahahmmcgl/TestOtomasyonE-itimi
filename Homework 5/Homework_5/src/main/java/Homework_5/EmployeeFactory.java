package Homework_5;

public class EmployeeFactory {
    public static Employee create(String name, String department, int salary, int workDays) {
        System.out.println("Creating employee with name: " + name);
        System.out.println("Creating employee with department: " + department);
        System.out.println("Creating employee with salary: " + salary);
        System.out.println("Creating employee with workDays: " + workDays);
        salary = (int) CalculateFullSalary(new Employee(name, department, salary, workDays));
        return new Employee(name, department, salary, workDays);
    }

    public static double CalculateFullSalary(Employee employee) {
        double BonusPayment=1000;
        double extraWorkPayment=0;

        double BaseSalary = employee.getSalary();
        int extraWorkDays = employee.getWorkDays() - 25;

        if (extraWorkDays > 0) {
            extraWorkPayment = extraWorkDays * BonusPayment;
        }
        return BaseSalary + extraWorkPayment;
    }
}
