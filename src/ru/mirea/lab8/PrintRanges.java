package ru.mirea.lab8;

import java.util.Scanner;

public class PrintRanges {
    static void printRange(int a, int b, int step){
        if(a*step>b*step) return;
        System.out.println(a);
        printRange(a+step, b, step);
    }
    static void printOneToN(int n){
        printRange(1, n, 1);
    }
    static void printAtoB(int a, int b){
        printRange(a, b, a>b ? -1 : 1);
    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while(true) {
            System.out.println("Введите n");
            int n = scanner.nextInt();
            if(n==0) break;
            printOneToN(n);
            System.out.println("\nВведите A и B");
            int a, b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            printAtoB(a, b);
        }
    }
}
