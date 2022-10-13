package ru.mirea.lab7;
/*
Разработайте интерфейс для работы со строками, который содержит
а) функции подсчета символов в строке б) функция возвращает строку, которая
образовывает строку, состоящую из символов исходной строки s, которые
размещены на нечетных позициях: 1, 3, 5, ...в) функцию инвертирования строки
 */

public interface StringTransformer {
    static String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1;i>0;--i){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
    static int countChars(String str){
        return str.length();
    }
    static String fromOdds(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=1;i<str.length();i+=2)
            stringBuilder.append(str.charAt(i));
        return stringBuilder.toString();
    }
}
