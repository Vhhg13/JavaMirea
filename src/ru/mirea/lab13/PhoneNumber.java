package ru.mirea.lab13;

import java.util.Scanner;

public class PhoneNumber {
    public static String prettyPrint(String number){
        StringBuilder sb = new StringBuilder(number.length()+4);
        int ind=number.length()-1;
        for(int i=0;i<4;++i){
            sb.append(number.charAt(ind--));
        }
        sb.append('-');
        for(int i=0;i<3;++i)
            sb.append(number.charAt(ind--));
        sb.append('-');
        for(int i=0;i<3;++i)
            sb.append(number.charAt(ind--));
        if(number.charAt(0)=='8')
            sb.append("7+");
        else
            while(ind>0)
                sb.append(number.charAt(ind--));
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=prettyPrint(scanner.nextLine());
        System.out.println(str);
    }
}
