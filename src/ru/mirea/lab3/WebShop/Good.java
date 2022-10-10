package ru.mirea.lab3.WebShop;

import ru.mirea.lab3.CurrencyConverter;

public class Good {
    private double price;
    private String name;

    public Good() {}
    public Good(String name, double price){
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Good's name: %s. It's price: %s", name, CurrencyConverter.formatCur(price));
    }
}
