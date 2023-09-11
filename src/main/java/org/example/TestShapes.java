package org.example;

public class TestShapes {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Circle circle = new Circle(5);
        printer.printShape(circle);

        Quad quad = new Quad(4);
        printer.printShape(quad);

        Rectangle rectangle = new Rectangle(4, 5);
        printer.printShape(rectangle);

        Triangle triangle = new Triangle(3, 4);
        printer.printShape(triangle);

        Ellipse ellipse = new Ellipse(3, 4);
        printer.printShape(ellipse);
    }
}
