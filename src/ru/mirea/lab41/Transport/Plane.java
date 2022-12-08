package ru.mirea.lab41.Transport;

public class Plane extends Transport{
    public Plane(double speed, double costPerKm) {
        super(speed, costPerKm);
    }
    public String getName(){
        return "самолёте";
    }
}
