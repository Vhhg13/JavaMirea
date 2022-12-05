package ru.mirea.lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pt = Pattern.compile("\\d+( |)[^+]");
        while(true){
            String str = scanner.nextLine();
            if(str.equals("")) break;
            Matcher mt = pt.matcher(str);
            System.out.println(mt.find());
        }
    }
}
