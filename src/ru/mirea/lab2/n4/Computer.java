package ru.mirea.lab2.n4;

public class Computer {
    private String name;

    public Computer(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+" computer";
    }
}
