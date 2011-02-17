/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spel;


public class Buttons{
    int nummer;
    int insattning2;
    int bet;
    String s;


    public String betMore(){
                nummer++;

        if (nummer==1){
            bet=1;
        }
        if (nummer==2){
            bet=4;
        }
        if (nummer==3){
            bet=10;
        }
        if (nummer==4){
            bet=20;
        }
        if (nummer==5){
            bet=40;
        }
        if (nummer>=6) {
            bet=40;
            nummer=5;
        }
        s = ""+bet;


        return s;
    }
    public String betMax(){
        bet=40;
        nummer=5;
        s = ""+bet;

        return s;
    }

    public String betLess(){
        nummer--;

        if (nummer==1){
            bet=1;
        }
        if (nummer==2){
            bet=4;
        }
        if (nummer==3){
            bet=10;
        }
        if (nummer==4){
            bet=20;
        }
        if (nummer==5){
            bet=40;
        }
        if (nummer<=0) {
            bet=0;
            nummer=0;
        }
        s = ""+bet;


        return s;
    }

    public String drawButton(String insattning) {
    insattning2 = Integer.parseInt(insattning);
    insattning2 = insattning2 - bet;
    insattning = ""+insattning2;
    return insattning;

    }
}
