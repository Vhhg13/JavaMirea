package ru.mirea.lab12.Shapes;

import java.awt.*;

public abstract class Shape {
    Color color;
    int x, y;
    abstract void draw(Graphics g);

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
}
