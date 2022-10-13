package ru.mirea.lab8;

import java.util.Scanner;

public class SumOfDigits {

    static int sumOfDigits(int n){
        if(n<10) return n;
        else return (n%10)+sumOfDigits(n/10);
    }

    static int go(int n,int s){
        int res=0;
        for(int i=n;i<n*10;++i)
            if(sumOfDigits(i)==s)
                res++;
        return res;
    }

    static int getResult(int k, int s){
        return go((int)Math.pow(10, k-1), s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите k и s");
        int k, s;
        k= scanner.nextInt();
        s= scanner.nextInt();
        System.out.println(getResult(k, s));

    }
}
