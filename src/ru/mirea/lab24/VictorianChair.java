package ru.mirea.lab24;

public class VictorianChair implements Chair{
    private int age;
    @Override
    public String getType() {
        return "Victorian Chair";
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
