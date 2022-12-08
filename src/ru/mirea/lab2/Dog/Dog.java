package ru.mirea.lab2.Dog;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Dog(String name){
        this.name=name;
        this.age=0;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    private String years(int age){
        if(age%10==1)
            return "год";
        if(age%10<=4)
            return "года";
        return "лет";
    }

    @Override
    public String toString(){
        return String.format("Псу по кличке %s %d %s", name, age, years(age));
    }

    public int getHumanAge(){
        return age*7;
    }

    public void printHumanAge(){
        System.out.format("Псу по кличке %s %d человеческих %s\n", name, getHumanAge(), years(getHumanAge()));
    }
}
