package ru.mirea.lab41.n10;

public class Plane extends Transport{
    public Plane(double speed, double costPerKm) {
        super(speed, costPerKm);
    }
    public String getName(){
        return "самолёте";
    }
}
