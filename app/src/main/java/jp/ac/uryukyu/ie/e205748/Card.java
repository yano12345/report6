package jp.ac.uryukyu.ie.e205748;

public class Card {
    private String suit;
    private int number;
    public Card(String suit, int number){
        this.suit = suit;
        this.number = number;
    }
    public String getSuit() { return suit; }
    public void setSuit(String suit){
        this.suit = suit;
    }
    public int getNumber() { return number; }
    public void setNumber(int number){
        this.number = number;
    }
}