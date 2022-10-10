package ru.mirea.lab4.WebShop;

public enum Good {
    PEN(35),
    PENCIL(22),
    ERASER(15),
    PAPER(1200),
    MARKER(80);
    private double price;

    Good(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getName(){ return toString(); }
}
