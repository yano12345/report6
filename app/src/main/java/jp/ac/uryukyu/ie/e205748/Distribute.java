package jp.ac.uryukyu.ie.e205748;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distribute {
    private List<Card> player1 = new ArrayList<>();
    private List<Card> player2 = new ArrayList<>();
    private int maxCard = 2;
    int num;
    public Distribute(){  
        Deck deck = new Deck();
        deck.disPlay();
        System.out.println("----------ここからシャッフルされたもの----------");
        deck.shuffle();
        System.out.println("--------------------------------------------");
        for (int i=0; i<4; i++){
            player1.add(new Card(deck.card.get(i).getSuit() , deck.card.get(i).getNumber()));
            if (deck.card.get(i).getNumber() > 10){
                num += 10;
            }else{
                num += deck.card.get(i).getNumber();
            }    
            i++;
            player2.add(new Card(deck.card.get(i).getSuit() , deck.card.get(i).getNumber()));
        }
        System.out.println("player1の一枚目のカードは");
        System.out.println(player1.get(0).getSuit() + player1.get(0).getNumber());
        System.out.println("player2の一枚目のカードは");
        System.out.println(player2.get(0).getSuit() + player2.get(0).getNumber());
        System.out.println("player1の二枚目のカードは");
        System.out.println(player1.get(1).getSuit() + player1.get(1).getNumber());
        System.out.println("player2の二枚目のカードは");
        System.out.println(player2.get(1).getSuit() + player2.get(1).getNumber());
        System.out.println(num);

        for (int i = 0; i < this.maxCard; i++){
            
        }
    }

}