package ru.mirea.lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pt = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Pattern pt2 = Pattern.compile("\\d{4}");
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("")) break;
            Matcher mt = pt.matcher(str);
            if(mt.matches()) {
                Matcher mt2 = pt2.matcher(str);
                mt2.find();
                int year = Integer.parseInt(mt2.group(), 10);
                System.out.println(1900 <= year && year <= 9999);
            }else System.out.println(false);
        }
    }
}
