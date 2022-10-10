package ru.mirea.lab3;

import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;

public class Tester {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(13));
    }


}
