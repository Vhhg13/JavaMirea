package ru.mirea.lab41.n2;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.printf("%s calls\n", name);
    }

    public void receiveCall(String name, int number){

    }

    public void sendMessage(int ... numbers){
        for(int n : numbers)
            System.out.println(n);
    }



    public Phone() {}

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }


    public static void main(String[] args) {
        Phone phone1 = new Phone(894512345, "Samsung", 12);
        Phone phone2 = new Phone(194594594, "Sony", 1);
        Phone phone3 = new Phone();
    }
}
