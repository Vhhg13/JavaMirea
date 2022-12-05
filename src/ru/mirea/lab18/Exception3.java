package ru.mirea.lab18;

import java.util.Scanner;

public class Exception3 {
    public void excDemo(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an int");
        try {
            int i = Integer.parseInt(myScanner.nextLine());
            System.out.println(2 / i);
        }catch(Exception e) {
            System.out.println("Caught Exception!!!!!!");
            // Раскомментировать:
        }
//        }catch(ArithmeticException ar){
//            System.out.println("Caught Arithmetic Exception!!");
//        }catch(NumberFormatException nf){
//            System.out.println("Caught Number Format Exception!!");
//        }
    }

    public static void main(String[] args) {
        new Exception3().excDemo();
    }
}
// 2 1
// qwerty 0.0
// 0