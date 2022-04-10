package task1;

public class Trapezoid implements Figure2D{
    private double a;
    private double b;
    private double c;
    private double d;

    public Trapezoid(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        double h = Math.pow((Math.pow(c, 2) - Math.pow(((Math.pow(b - a, 2) + Math.pow(c, 2) - Math.pow(d, 2)) /
                (2 * (b - a))), 2)), 0.5);
        double s = (a + b) / 2 * h;
        return s;
    }

    @Override
    public double perimetr() {
        return a + b + c + d;
    }

}
