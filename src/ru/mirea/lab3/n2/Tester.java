package ru.mirea.lab3.n2;

import java.util.Arrays;

/*
Класс Круг
Класс Точка
Создать массив кругов
отсортировать
вывести наибольший и наименьший
*/


public class Tester {

    private static final int numOfElements=5;
    private static Circle[] circles=new Circle[numOfElements];

    public static Circle getBiggestCircle(){
        Circle max=circles[0];
        for(Circle c : circles)
            if(c.getRadius()>max.getRadius())
                max=c;
        return max;
    }
    public static Circle getSmallestCircle(){
        Circle max=circles[0];
        for(Circle c : circles)
            if(c.getRadius()<max.getRadius())
                max=c;
        return max;
    }
    public static void sortCircles(){
        Arrays.sort(circles);
    }
    public static void main(String[] args) {
        circles[0]=new Circle(0, 0);
        circles[1]=new Circle(new Point(0,0));

        Point point=new Point(1, 2);
        circles[2]=new Circle(point);

        Point point1=new Point(0, 7);
        circles[3]=new Circle(point1);

        circles[4]=circles[0];
        circles[0].getCentre().moveXY(-1, 2);

        sortCircles();

        for (Circle c : circles) {
            System.out.println(c);
        }
        System.out.println("\nThe biggest circle is:");
        System.out.println(getBiggestCircle());
        System.out.println("\nThe smallest circle is:");
        System.out.println(getSmallestCircle());
    }
}
