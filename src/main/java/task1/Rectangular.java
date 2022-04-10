package task1;

public class Rectangular implements Figure2D{
    private double a;
    private double b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        double s = a * b;
        return s;
    }

    @Override
    public double perimetr() {
        return 2 * (a + b);
    }


}
