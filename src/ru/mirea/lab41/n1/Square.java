package ru.mirea.lab41.n1;

public class Square extends Rectangle{
    public Square(double a) {
        super(a, a);
    }

    @Override
    protected String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "a square with side " + getA();
    }
}
