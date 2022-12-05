package ru.mirea.lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pt = Pattern.compile("\\d+(\\.\\d+|) (EUR|RUB|USD)");
        Matcher mt = pt.matcher(str);
        while(mt.find())
            System.out.println(mt.group());
    }
}
