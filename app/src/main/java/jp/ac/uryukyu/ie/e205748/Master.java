package jp.ac.uryukyu.ie.e205748;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Master {
    private int num1;
    private int num2;
    Distribute distribute = new Distribute();
    public Master(){
        System.out.println("ブラックジャックを開始します");
        System.out.println("player1の一枚目のカードは");
		System.out.println(distribute.player1.get(0).getSuit() + distribute.player1.get(0).getNumber());
        System.out.println("player1の二枚目のカードは");
        System.out.println(distribute.player1.get(1).getSuit() + distribute.player1.get(1).getNumber());            System.out.println("player2の一枚目のカードは");
        System.out.println(distribute.player2.get(0).getSuit() + distribute.player2.get(0).getNumber());
        System.out.println("player2の二枚目のカードはわかりません");
        for (int i=0; i<2; i++){
            if (distribute.player1.get(i).getNumber() > 10) {
                num1 += 10;
            }else{
                num1 += distribute.player1.get(i).getNumber();
            }if (distribute.player2.get(i).getNumber() > 10) {
                num2 += 10;
            }else{
                num2 += distribute.player2.get(i).getNumber();
            }
        }
    }

    public void playing(){
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ヒットする場合はy、スタンドする場合はnを押してください");
        System.out.println("(y/n):");
        int aa = 2;
        boolean yn = false;
        while (!yn) {
            final final final final String input = br.readLine();
            if (input.equals("Y") || input.equals("y")) {                    
                yn = true;    
                distribute.player1Add();
                if (distribute.player1.get(aa).getNumber() > 10) {
                    num1 += 10;
                    aa++;
                }else{
                    num1 += distribute.player1.get(aa).getNumber();
                    aa++;
                }
            }else if(input.equals("N") || input.equals("n")){
                break;
            }else {
                System.out.println("yかnを入力してください");
            }
        int bb = 2;
        if (num2 < 17){
            distribute.player2Add();
        }else if(distribute.player2.get(bb).getNumber() > 10){
            num2 += 10;  
            bb++; 
        }else{
            num2 += distribute.player2.get(bb).getNumber();
            bb++;
        }

    }
}    