package ru.mirea.lab11;

//Написать программу, выводящую фамилию разработчика, дату и время
//        получения задания, а также дату и время сдачи задания. Для получения
//        последней даты и времени использовать класс Date из пакета java.util.*

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Dates1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");

        System.out.print("Задание выдано ");
        Date date1 = new Date();
        System.out.println(sdf.format(date1));

        System.out.println("Нажмите Enter чтобы сдать задание");
        (new Scanner(System.in)).nextLine();

        System.out.print("Задение сдано ");
        Date date2 = new Date();
        System.out.println(sdf.format(date2));

        sdf = new SimpleDateFormat("mm 'минут' и ss 'секунд'");
        System.out.println("На выполнение задания ушло "+sdf.format(new Date(date2.getTime()-date1.getTime())));
    }
}
