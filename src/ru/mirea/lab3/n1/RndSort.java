package ru.mirea.lab3.n1;
import java.util.Arrays;
import java.util.Random;

/*Создать массив вещественных чисел случайным образом, вывести его
на экран, отсортировать его, и снова вывести на экран (использовать два
подхода к генерации случайных чисел – метод random() класса Math и класс
Random)*/

public class RndSort {
    public static void main(String[] args){
        double[] array=new double[10];

        System.out.println("Массив, заполненный с помощью Math.random():");
        for(int i=0;i<10;++i)
            array[i]=Math.random()*100;
        for(double i : array)
            System.out.format("%.1f ", i);

        System.out.println("\nПосле сортировки:");
        Arrays.sort(array);
        for(double i : array)
            System.out.format("%.1f ", i);
        ///////////////////////////////////////////////////////////////////
        System.out.println("\n\nМассив, заполненный с помощью Random:");
        Random rnd = new Random();
        for(int i=0;i<10;++i)
            array[i]=rnd.nextDouble(100);
        for(double i : array)
            System.out.format("%.1f ", i);

        System.out.println("\nПосле сортировки:");
        Arrays.sort(array);
        for(double i : array)
            System.out.format("%.1f ", i);
    }
}
