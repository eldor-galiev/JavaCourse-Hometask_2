package task2;


public class EmployeesTest {
    public static void main(String[] args) {
        Employees employee_1 = new EmployeesWithHourlyPay("Eldor", 80);
        Employees employee_2 = new EmployeesWithFixedPay("Daniil", 10_000);

        System.out.println("Salary of the first employee: " + employee_1.salary());
        System.out.println("Salary of the second employee: " + employee_2.salary());


    }
}
