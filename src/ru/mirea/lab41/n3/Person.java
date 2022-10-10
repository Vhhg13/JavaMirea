package ru.mirea.lab41.n3;

public class Person {
    private String fullName;
    private int age;

    public void move() {
        System.out.printf("%s moves\n", fullName);
    }

    public void talk() {
        System.out.printf("%s talks\n", fullName);
    }

    public Person() {
        fullName = "";
        age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ivanov Ivan Ivanovich", 35);
    }
}
