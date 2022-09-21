package ru.mirea.lab2.n2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);

        b1.move(30, 15);
        System.out.println(b1);

        b1.setX(99);
        System.out.println(b1);

        b1.setY(101);
        System.out.println(b1);

        b1.setXY(-1, 1);
        System.out.println(b1);
    }
}
