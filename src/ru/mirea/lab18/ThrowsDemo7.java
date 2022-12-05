package ru.mirea.lab18;

import java.util.Scanner;

public class ThrowsDemo7 {
    public void getKey(){
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        try {
            printDetails(key);
        }catch(Exception e){
            System.out.println("Caught Exception");
        }
    }
    public void printDetails(String key) throws Exception{
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) throws Exception {
        if(key==""){
            throw new Exception("Key set to empty string");
        }
        return "data for "+key;
    }

    public static void main(String[] args) {
        new ThrowsDemo7().getKey();
    }
}
