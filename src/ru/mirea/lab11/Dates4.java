package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Dates4 {
    private static SimpleDateFormat df=new SimpleDateFormat("yyyy MM dd HH mm");
    public static Date getDate(String str){
        try {
            return df.parse(str);
        }catch(Exception e){
            return null;
        }
    }
    public static Calendar getCal(String str){
        try{
            Calendar cal=Calendar.getInstance();
            cal.setTime(df.parse(str));
            return cal;
        }catch(Exception e){
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date;
        try {
            date = getDate(scanner.nextLine());
        }catch(Exception e){
            return;
        }
        System.out.println(df.format(date));
        Calendar cal;
        try{
            cal = getCal(scanner.nextLine());
        }catch(Exception e){
            return;
        }
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)+" "+cal.get(Calendar.MONTH)+1+" "+cal.get(Calendar.YEAR));
    }
}
