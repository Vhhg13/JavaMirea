package ru.mirea.lab18;

import java.util.Scanner;

public class Exception4 {
    public void excDemo(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an int");
        try {
            int i = Integer.parseInt(myScanner.nextLine());
            System.out.println(2 / i);
        }catch(ArithmeticException ar){
            System.out.println("Caught Arithmetic Exception!!");
        }catch(NumberFormatException nf){
            System.out.println("Caught Number Format Exception!!");
        }finally {
            System.out.println("This will always be printed");
        }
    }

    public static void main(String[] args) {
        new Exception4().excDemo();
    }
}
