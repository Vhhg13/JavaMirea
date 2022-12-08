package ru.mirea.lab41.Transport;

public class Train extends Transport{
    public Train(double speed, double costPerKm) {
        super(speed, costPerKm);
    }
    public String getName(){
        return "поезде";
    }
}
