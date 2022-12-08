package ru.mirea.lab41.Transport;

public class Car extends Transport{
    public Car(double speed, double costPerKm) {
        super(speed, costPerKm);
    }
    public String getName(){
        return "машине";
    }
}
