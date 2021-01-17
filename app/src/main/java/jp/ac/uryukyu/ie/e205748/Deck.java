package jp.ac.uryukyu.ie.e205748;

public class Deck {
    private Card card[];
    public Deck(){
        card = new Card[52];
        int rank = 0;
        for (int i = 1; i <= 4; i++){
            if (i == 1){
                for (int j = 1; j <= 13; j++){
                    this.card[rank] = new Card("❤︎", j);
                    rank++;
                }
            }else if (i == 2){
                for (int j = 1; j <= 13; j++){
                    this.card[rank] = new Card("♦︎", j);
                    rank++;
                }
            }else if (i == 3){
                for (int j = 1; j <= 13; j++){
                    this.card[rank] = new Card("♠︎", j);
                    rank++;
                }
            }else if (i == 4){
                for (int j = 1; j <= 13; j++){
                    this.card[rank] = new Card("♣︎", j);
                    rank++;
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
