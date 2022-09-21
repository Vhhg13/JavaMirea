package ru.mirea.lab2.n3;

public class Tester {
    public static void main(String[] args) {
        final int numOfElements=5;
        Circle[] circles=new Circle[numOfElements];

        circles[0]=new Circle(0, 0);

        circles[1]=new Circle(new Point(0,0));

        Point point=new Point(1, 2);
        circles[2]=new Circle(point);

        Point point1=new Point(0, 7);
        circles[3]=new Circle(point1);

        circles[4]=circles[0];
        circles[0].getCentre().moveXY(-1, 2);

        for (Circle c :
                circles) {
            System.out.println(c);
        }
    }
}
