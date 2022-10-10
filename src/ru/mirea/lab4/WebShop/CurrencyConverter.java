package ru.mirea.lab4.WebShop;

import java.util.Hashtable;
import java.util.Scanner;

public class CurrencyConverter {
    private Hashtable<String, Double> table=new Hashtable<>();

    public void setExchangeRatePerDollar(String curr, double perDollar){
        table.put(curr, perDollar);
    }

    public CurrencyConverter(double RUBtoUSD, double YUANtoUSD, double EURtoUSD) {
        table.put("RUB", RUBtoUSD);
        table.put("YUAN", YUANtoUSD);
        table.put("EUR", EURtoUSD);
    }

    private double convertToUSD(double amt, String from){
        if(from.compareTo("USD")==0) return amt;
        return amt*table.get(from);
    }
    private double convertFromUSD(double amt, String to){
        if(to.compareTo("USD")==0) return amt;
        return amt/table.get(to);
    }
    public double convert(double amt, String from, String to){
        return convertFromUSD(convertToUSD(amt, from), to);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CurrencyConverter currencyConverter=new CurrencyConverter(0.017, 0.14, 0.98);
        while(true) {
            System.out.println("Введите сумму:");
            double amt=Double.parseDouble(scanner.nextLine());
            if(amt==0) break;
            System.out.println("Введите исходную валюту");
            String from=scanner.nextLine();
            System.out.println("Введите целевую валюту");
            String to=scanner.nextLine();
            System.out.format("%.2f %s можно обменять на %.2f %s\n", amt, from, currencyConverter.convert(amt, from, to), to);
        }
    }
}
