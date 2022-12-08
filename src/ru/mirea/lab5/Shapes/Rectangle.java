package ru.mirea.lab5.Shapes;

import java.awt.*;

public class Rectangle extends Shape {
    int a, b;

    public Rectangle(Color color, int x, int y, int a, int b) {
        super(color, x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, a, b);
    }
}
