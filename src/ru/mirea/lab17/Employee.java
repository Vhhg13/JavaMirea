package ru.mirea.lab17;

public class Employee {
    private String name;
    private double perHour;
    private int hoursWorked;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerHour() {
        return perHour;
    }

    public void setPerHour(double perHour) {
        this.perHour = perHour;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Employee(String name, double perHour, int hoursWorked) {
        this.name = name;
        this.perHour = perHour;
        this.hoursWorked = hoursWorked;
    }
    public double getSalary(){
        return hoursWorked*perHour;
    }
}
