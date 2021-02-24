package jp.ac.uryukyu.ie.e205748;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distribute {
	ArrayList<Card> player1 = new ArrayList<>();
    ArrayList<Card> player2 = new ArrayList<>();
    private int count;
    Deck deck = new Deck();
    public Distribute() {
        deck.disPlay();
        System.out.println("----------ここからシャッフルされたもの----------");
        deck.shuffle();
        System.out.println("--------------------------------------------");
        for (int i = 0; i < 4; i++) {
            player1.add(new Card(deck.card.get(i).getSuit(), deck.card.get(i).getNumber()));
            count++;
            i++;
            player2.add(new Card(deck.card.get(i).getSuit(), deck.card.get(i).getNumber()));
            count++;
        }
        System.out.println(count);
    }

    public ArrayList<Card> getPlayer1() { return player1; }
    public ArrayList<Card> getPlayer2() { return player2; }
    public void setPlayer1(ArrayList<Card> player1) {
        this.player1 = player1;
    }
    public void setPlayer2(ArrayList<Card> player2){
        this.player2 = player2;
    }

    public void player1Add(){
        player1.add(new Card(deck.card.get(count).getSuit(), deck.card.get(count).getNumber()));
        count++;
    }

    public void player2Add(){
        player2.add(new Card(deck.card.get(count).getSuit(), deck.card.get(count).getNumber()));
        count++;
    }
    
}