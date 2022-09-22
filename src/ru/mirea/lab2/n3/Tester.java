package ru.mirea.lab2.n3;

public class Tester {
    private final int numOfElements=5;
    private Circle[] circles=new Circle[numOfElements];
    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.circles[0]=new Circle(0, 0);

        tester.circles[1]=new Circle(new Point(0,0));

        Point point=new Point(1, 2);
        tester.circles[2]=new Circle(point);

        Point point1=new Point(0, 7);
        tester.circles[3]=new Circle(point1);

        tester.circles[4]=tester.circles[0];
        tester.circles[0].getCentre().moveXY(-1, 2);

        for (Circle c :
                tester.circles) {
            System.out.println(c);
        }
    }
}
