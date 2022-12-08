package ru.mirea.lab6.Convertable;

public class Main {
    public static void main(String[] args) {
        Convertable kelvin = new TKelvin(500);
        Convertable farenheit = new TFarenheit(500);
        System.out.println("500 F = " + farenheit.convert() + "K");
        System.out.println("500 K = " + kelvin.convert() + "F");
    }
}
