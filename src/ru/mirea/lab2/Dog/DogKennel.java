package ru.mirea.lab2.Dog;

public class DogKennel {
    public static void main(String[] args) {
        Dog[] dogs=new Dog[3];
        dogs[0]=new Dog("Шарик", 3);
        dogs[1]=new Dog("Тузик");
        dogs[2]=new Dog("Рекс", 10);
        for(Dog d : dogs)
            System.out.println(d);
    }
}
