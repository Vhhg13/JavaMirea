package ru.mirea.lab13;

import java.util.Random;
import java.util.Scanner;

public class n1 {
    public static void method(String str){
        for(int i=0;i<str.length() && i<10;++i)
            System.out.print(i);
        System.out.println();
        System.out.println("Последний символ строки: "+str.charAt(str.length()-1));
        System.out.printf("Строка \"%s\"%s заканчиватся на \"!!!\"\n", str, str.endsWith("!!!") ? "" : " не");
        System.out.printf("Строка \"%s\"%s начинается на \"I like\"\n", str, str.startsWith("I like") ? "" : " не");
        if(str.contains("Java"))
            System.out.printf("Строка \"%s\" содержит слово Java по индексу %d\n", str, str.indexOf("Java"));
        else
            System.out.printf("Строка %s не содержит слово Java\n", str);
        System.out.printf("Если заменить все a на о то получится \"%s\"\n", str.replace("a", "o"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        Random rnd = new Random();
        int ind1 = rnd.nextInt(0, str.length()/2);
        int ind2 = rnd.nextInt(str.length()/2, str.length());
        System.out.println("\""+str.substring(ind1, ind2)+"\"");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        method(scanner.nextLine());
    }
}
