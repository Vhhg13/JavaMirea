package ru.mirea.lab3.SortingCircles;


import java.util.Random;

public class Circle implements Comparable<Circle> {
    private static Random rnd=new Random();

    private Point centre;
    private double radius=Math.floor(rnd.nextDouble()*10000)/100;

    public Circle(double x, double y) {
        centre = new Point(x, y);
    }

    public Circle(Point o) {
        centre = o;
    }

    public Point getCentre() {
        return centre;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return "Circle with centre in "+centre+" and radius of "+radius;
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(radius, o.radius);
    }
}
