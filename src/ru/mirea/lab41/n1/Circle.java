package ru.mirea.lab41.n1;

public class Circle extends Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    protected String getType() {
        return "Circle";
    }

    @Override
    protected double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    protected double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "a circle with radius of " + radius;
    }
}
