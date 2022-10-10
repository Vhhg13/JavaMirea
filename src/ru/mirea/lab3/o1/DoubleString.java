package ru.mirea.lab3.o1;

public class DoubleString {
    public static void main(String[] args) {

        // Вызов методов класса Double
        Double d1 = Double.valueOf("2.718");
        Double d2 = Double.valueOf(1.618);
        double d3 = Double.parseDouble("1.414");

        // Преобразование к примитивным типам
        float dFlt = d1.floatValue();
        double dDbl = d1;
        byte dByte = d1.byteValue();
        short dSht = d1.shortValue();
        int dInt = d1.intValue();
        long dLong = d1.longValue();
        // char bool X

        // Вывод
        System.out.println(d2);

        // Преобразование к строке
        String d = Double.toString(3.14);
    }
}
