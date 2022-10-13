package ru.mirea.lab6.WebShop;

public class Processor {
    String name;

    public Processor(String name) {
        this.name = name;
    }

    public Processor() {
        name="";
    }

    public String getName() {
        return name;
    }
}
