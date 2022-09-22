package ru.mirea.lab2.n6;

public class Circle {
    private double radius=1;

    public Circle(){}

    public Circle(double radius, String color){
        this.radius=radius;
//        this.color=color;
    }
    public Circle(double radius){
        this.radius=radius;
    }


    // Геттеры
    public double getRadius() {
        return radius;
    }

    // Сеттеры
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
