package ru.mirea.lab3.SortingCircles;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point another){
        this.x=another.x;
        this.y=another.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void moveX(double dx) {
        x += dx;
    }

    public void moveY(double dy) {
        y += dy;
    }

    public void moveXY(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}
