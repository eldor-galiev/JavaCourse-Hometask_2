package task2;

public class EmployeesWithFixedPay extends Employees{
    private double FeePerMonth;

    public EmployeesWithFixedPay(String name, double FeePerMonth) {
        super(name);
        this.FeePerMonth = FeePerMonth;
    }

    @Override
    double salary() {
        return FeePerMonth;
    }
}
