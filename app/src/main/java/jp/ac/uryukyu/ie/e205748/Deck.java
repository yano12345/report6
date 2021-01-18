package jp.ac.uryukyu.ie.e205748;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> card = new ArrayList<>();
    public Deck(){
        for (var i = 1; i <= 4; i++){
            if (i == 1 ){
                for (int j = 1; j <= 13; j++){
                    card.add(new Card("❤︎", j));     
                }
            }else if (i == 2){
                for (int j = 1; j <= 13; j++){
                    card.add(new Card("♠︎", j));
                }
            }else if (i == 3){
                for (int j = 1; j <= 13; j++){
                    card.add(new Card("♣︎", j));
                }
            }else if (i == 4){
                for (int j = 1; j <= 13; j++){
                    card.add(new Card("♦︎", j));
                } 
            }       
        }   
    }   
    public void disPlay(){
        for (Card s: this.card){
            System.out.println(s.getSuit() + s.getNumber());
        }
    }
}    