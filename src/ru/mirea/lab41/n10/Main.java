package ru.mirea.lab41.n10;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[4];
        transports[0]=new Car(80, 1);
        transports[1]=new Train(150, 3);
        transports[2]=new Ship(60, 2);
        transports[3]=new Plane(300, 4);
        for(Transport t : transports)
            System.out.printf("На %s вы пройдёте %d км за %.2f часов и %.2f денег\n", t.getName(), 1000, t.getTimeToTravel(1000), t.getPriceToTravel(1000));
    }
}
