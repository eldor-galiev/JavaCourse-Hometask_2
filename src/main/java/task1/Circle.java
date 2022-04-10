package task1;

public class Circle implements Figure2D{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double s = Math.pow(radius, 2) * Math.PI;
        return s;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

}
