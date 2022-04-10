package task1;

public class PrismTest {
    public static void main(String[] args) {
        Figure2D Triangle = new Triangle(3, 4, 5);
        Figure2D Circle = new Circle(5);
        Figure2D Rectangular = new Rectangular(10, 8);
        Figure2D Trapezoid = new Trapezoid(15, 20, 5, 6);

        Prism prism_1 = new Prism(Triangle, 25);
        Prism prism_2 = new Prism(Circle, 18);
        Prism prism_3 = new Prism(Rectangular, 30);
        Prism prism_4 = new Prism(Trapezoid, 10);

        System.out.println("The volume of a triangular prism: " + prism_1.volume());
        System.out.println("The volume of a cylindr: " + prism_2.volume());
        System.out.println("The volume of a rectangular prism: " + prism_3.volume());
        System.out.println("The volume of a trapezoidal prism: " + prism_4.volume());

        System.out.println("-------");

        System.out.println("The surface area of a triangular prism: " + prism_1.surfaceArea());
        System.out.println("The surface area of a cylindr: " + prism_2.surfaceArea());
        System.out.println("The surface area of a rectangular prism: " + prism_3.surfaceArea());
        System.out.println("The surface area of a trapezoidal prism: " + prism_4.surfaceArea());


    }
}
