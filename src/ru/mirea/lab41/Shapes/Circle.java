package ru.mirea.lab41.Shapes;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle( double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

//    @Override
//    protected String getType() {
//        return "Circle";
//    }

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
