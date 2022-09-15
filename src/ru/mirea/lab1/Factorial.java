package ru.mirea.lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    private static BigInteger fact(int n){
        BigInteger res=BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            res=res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        BigInteger result=fact(scanner.nextInt());
        System.out.println(result);
    }
}
