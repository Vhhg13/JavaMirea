package ru.mirea.lab26;

public class MyObj {
    private final int data;

    public MyObj(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MyObj{" +
                "data=" + data +
                '}';
    }
}
