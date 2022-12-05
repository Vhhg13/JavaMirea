package ru.mirea.lab18;

import java.util.Scanner;

public class ThrowsDemo8 {
    public void getKey(){
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<2;++i){
            String key = scanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Wrong input, try again");
            }
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
        new ThrowsDemo8().getKey();
    }
}
