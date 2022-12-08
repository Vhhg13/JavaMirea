package ru.mirea.lab3.RisingArray;

import java.util.Random;

/*
Является ли массив из 4 чисел строго возрастающей последовательностью
 */

public class RisingArray {
    public static boolean isRising(int[] arr) {
        for(int i=0;i<arr.length-1;++i)
            if(arr[i]>arr[i+1])
                return false;
        return true;
    }
    public static void main(String[] args) {
        Random rnd=new Random();
        int[] arr=new int[4];
        for(int i=0;i<4;++i)
            arr[i]=rnd.nextInt(90)+10;
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
        if(isRising(arr)){
            System.out.println("Это строго возрастающая последовательность");
        }else{
            System.out.println("Это не строго возрастающая последовательность");
        }
    }
}
