package ru.mirea.lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abcdefghijklmnopqrstuv18340 {
    public static void main(String[] args) {
        while(true) {
            Pattern pt = Pattern.compile("abcdefghijklmnopqrstuv18340");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if(line=="") break;
            Matcher mt = pt.matcher(line);
            System.out.println(mt.matches());
        }
    }
}
