package task1;

public class Prism {
    private Figure2D base;
    private double h;

    public Prism(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    // метод вычисления объема
    public double volume() {
        double v = base.area() * h;
        return v;
    }

    // площадь поверхности
    public double surfaceArea() {
        double side_surfaceArea = base.perimetr() * h;
        double full_surfaceArea = 2 * base.area() + side_surfaceArea;
        return full_surfaceArea;
    }
}
