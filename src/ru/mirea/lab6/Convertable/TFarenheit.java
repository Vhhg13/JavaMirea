package ru.mirea.lab6.Convertable;

public class TFarenheit implements Convertable{
    double amt;

    public TFarenheit(double amt) {
        this.amt = amt;
    }

    @Override
    public double convert() {
        return (amt-32)*5/9+273.15;
    }
}
