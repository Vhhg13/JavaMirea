package ru.mirea.lab41.n1;

public class Rectangle extends Shape{
    private final double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    protected double getArea() {
        return a*b;
    }

    @Override
    protected double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    protected String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "a rectangle with sides " + a + " and " + b;
    }
}
