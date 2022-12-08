package ru.mirea.lab6.Convertable;

public class TKelvin implements Convertable{
    public double amt;

    public TKelvin(double amt) {
        this.amt = amt;
    }

    @Override
    public double convert() {
        return 1.8*(amt-273.51)+32;
    }
}
