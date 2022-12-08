package ru.mirea.lab2.Poker;
import java.util.Scanner;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        String[] suits={"Diamonds", "Hearts", "Clubs", "Spades"};
        PokerCard[] cards=new PokerCard[4*13];
        for(int i=0;i<52;++i)
            cards[i]=new PokerCard(suits[i/13], (i%13)+1);

        // Shuffle
        Random rand=new Random();
        for(int i=0;i<52;++i){
            int randIndexToSwap=rand.nextInt(52);
            PokerCard tmp=cards[i];
            cards[i]=cards[randIndexToSwap];
            cards[randIndexToSwap]=tmp;
        }

        System.out.println("Введите количество игроков: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        PokerPlayer[] players=new PokerPlayer[n];
        for(int i=0;i<n;++i)
            players[i]=new PokerPlayer();

        for(int i=0;i<5*n;++i)
            players[i%n].receiveCard(cards[i]);

        for(int i=0;i<n-1;++i) {
            System.out.println("Player "+(i+1)+" has:");
            players[i].printCards();
            System.out.println();
        }
        if(n>=1){
            System.out.println("Player "+n+" has:");
            players[n-1].printCards();
        }
    }
}
