package ru.mirea.lab11;

//Приложение, сравнивающее текущую дату и дату, введенную
//        пользователем c текущим системным временем

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Dates2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd MM yyyy HH:mm:");
        String dateStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm");
        Date date;
        try {
            date = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Дата введена нперавильно");
            return;
        }
        Date now = new Date();
        Date diff = new Date(Math.abs(now.getTime() - date.getTime()));
        Calendar cal = Calendar.getInstance();
        cal.setTime(diff);
        System.out.printf("Между текущей и введённой датой %d лет %d месяцев %d дней %d часов %d минут %d секунд\n",
                cal.get(Calendar.YEAR) - 1970,
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH) - 1,
                cal.get(Calendar.HOUR_OF_DAY) - 3, //MSK = GMT+3
                cal.get(Calendar.MINUTE),
                cal.get(Calendar.SECOND)
        );
    }
}
