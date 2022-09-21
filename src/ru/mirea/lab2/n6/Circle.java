package ru.mirea.lab2.n6;

public class Circle {
    private double radius=1;
    private String color="Красный";

    public Circle(){}

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(String color){
        this.color=color;
    }

    // Геттеры
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    // Сеттеры
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Остальное поведение
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    public int compareTo(Circle circle2){
        return Double.compare(radius, circle2.radius);
    }
}
