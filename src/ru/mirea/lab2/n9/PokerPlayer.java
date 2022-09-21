package ru.mirea.lab2.n9;

import java.util.ArrayList;

public class PokerPlayer {
    ArrayList<PokerCard> cardsOnHand=new ArrayList<PokerCard>();
    public void receiveCard(PokerCard card){
        cardsOnHand.add(card);
    }
    public void printCards(){
        for(PokerCard c : cardsOnHand){
            System.out.println(c);
        }
    }
}
