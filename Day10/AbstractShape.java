abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }

    double area() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    double l, b;
    Rectangle(double l, double b) { this.l = l; this.b = b; }

    double area() {
        return l * b;
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Shape c = new Circle(3);
        Shape r = new Rectangle(4, 5);

        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
    }
}
