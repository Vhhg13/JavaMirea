package ru.mirea.lab2.n2;

public class Ball {
    private double x, y; // По умолчанию 0.0

    public Ball() {
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Сеттеры
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        // Двигает шар на xDisp по х и на yDisp по у
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return String.format("Ball @ (%f, %f)", x, y);
    }
}
