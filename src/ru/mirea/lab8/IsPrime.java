package ru.mirea.lab8;

import java.util.Scanner;

public class IsPrime {

    static boolean go(int n, int div){
        if(n%div==0)
            return false;
        if(div>Math.sqrt(n)) return true;
        return go(n, div+1);
    }
    static boolean isPrime(int n){
        if(n<3) return true;
        return go(n, 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int n=scanner.nextInt();
            if(n==0) break;
            System.out.println(n + " " + (isPrime(n) ? "YES" : "NO"));
        }

    }
}
