package ru.mirea.lab41.Transport;

public class Ship extends Transport{
    public Ship(double speed, double costPerKm) {
        super(speed, costPerKm);
    }
    public String getName(){
        return "корабле";
    }
}
