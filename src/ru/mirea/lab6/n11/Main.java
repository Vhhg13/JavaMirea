package ru.mirea.lab6.n11;

public class Main {
    public static void main(String[] args) {
        TKelvin kelvin = new TKelvin(500);
        TFarenheit farenheit = new TFarenheit(500);
        System.out.println("500 F = " + farenheit.convert() + "K");
        System.out.println("500 K = " + kelvin.convert() + "F");
    }
}
