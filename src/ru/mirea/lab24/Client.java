package ru.mirea.lab24;

public class Client {
    public Chair chair;
    public void setChair(Chair chair){
        this.chair=chair;
    }
    public void sit(){
        System.out.println("Client sits on "+chair.getType());
    }
    public static void main(String[] args) {
        AbstractChairFactory cf = new ChairFactory();
        Client client = new Client();
        client.setChair(cf.createMagicChair());
        client.sit();
        client.setChair(cf.createMultifunctionalChair());
        client.sit();
    }
}
