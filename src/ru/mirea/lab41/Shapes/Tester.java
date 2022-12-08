package ru.mirea.lab41.Shapes;

public class Tester {

    private static void printInfo(Shape shape){
        System.out.println(shape);
        System.out.printf("Area: %.2f\n", shape.getArea());
        System.out.printf("Perimeter: %.2f\n", shape.getPerimeter());
        //System.out.printf("Type: %s\n", shape.getType());
    }

    public static void main(String[] args) {
        Shape shape;

        shape=new Square(3);
        printInfo(shape);
        System.out.println();

        shape=new Rectangle(1, 5);
        printInfo(shape);
        System.out.println();

        shape=new Circle(10);
        printInfo(shape);
    }
}
