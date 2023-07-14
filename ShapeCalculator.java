public abstract class Shape {
    public abstract double calculateArea();
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}

public class ShapeCalculator {
    public void printArea(Shape shape) {
        System.out.println("The area of the shape is " + shape.calculateArea());
    }

    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(10, 20);
        calculator.printArea(rectangle);

        Circle circle = new Circle(10);
        calculator.printArea(circle);

        Triangle triangle = new Triangle(10, 20);
        calculator.printArea(triangle);
    }
}
