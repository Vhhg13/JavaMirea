package ru.mirea.lab3.ExtractEven;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/*
Создать массив из n элементов
Создать второй массив только из чётных
 */

public class ExtractEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random rnd=new Random();
        int n;
        while(true) {
            n=scanner.nextInt();
            if(n<=3)
                System.out.println("Это число не подходит");
            else break;
        }
        int[] arr=new int[n];
        for(int i=0;i<arr.length;++i)
            arr[i]= rnd.nextInt(n+1);
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i : arr)
            if(i%2==0)
                even.add(i);
        for(int i : even)
            System.out.print(i+" ");
    }
}
