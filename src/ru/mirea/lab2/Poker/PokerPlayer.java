package ru.mirea.lab2.Poker;

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
