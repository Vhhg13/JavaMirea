package ru.mirea.lab2.n9;

public class PokerCard {
    String suit;
    int num;
    public PokerCard(String suit, int num){
        this.suit=suit;
        this.num=num;
    }
    public String toString(){
        return num+" of "+suit;
    }
}
