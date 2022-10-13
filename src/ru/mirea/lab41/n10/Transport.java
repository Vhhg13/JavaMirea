package ru.mirea.lab41.n10;

public abstract class Transport {
    protected double speed;
    protected double costPerKm;
    public double getTimeToTravel(double km){
        return km/speed;
    }
    public double getPriceToTravel(double km) {
        return km/costPerKm;
    }

    public Transport(double speed, double costPerKm) {
        this.speed = speed;
        this.costPerKm = costPerKm;
    }
    public abstract String getName();
}
