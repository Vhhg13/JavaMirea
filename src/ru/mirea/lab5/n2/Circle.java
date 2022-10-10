package ru.mirea.lab5.n2;

import java.awt.*;

public class Circle extends Shape{
    private int r;
    public Circle(Color color, int x, int y, int r) {
        super(color, x, y);
        this.r=r;
    }

    public int getR() {
        return r;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, r, r);
    }
}
