package ru.mirea.lab14;

import java.util.Scanner;

public class SplitByRE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strs={""};
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("")) break;
            String reg = scanner.nextLine();
            strs=str.split(reg);
        }
        for(String s : strs){
            System.out.println(s);
        }
    }
}
