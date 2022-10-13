package ru.mirea.lab41.n10;

public class Train extends Transport{
    public Train(double speed, double costPerKm) {
        super(speed, costPerKm);
    }
    public String getName(){
        return "поезде";
    }
}
