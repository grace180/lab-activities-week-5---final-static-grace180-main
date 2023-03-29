package oop.lab.week5;


public class Circle {
    final double PI = 3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}














