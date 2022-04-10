package task2;

public class EmployeesWithHourlyPay extends Employees{
    private double feePerHour;

    public EmployeesWithHourlyPay(String name, double feePerHour) {
        super(name);
        this.feePerHour = feePerHour;
    }

    @Override
    double salary() {
        return 20.8 * 8 * feePerHour;
    }
}
