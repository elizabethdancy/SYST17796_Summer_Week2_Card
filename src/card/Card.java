/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 * A class to model cards
 * @author dancye, 2019
 */
public class Card {

   private String suit;
   private int value;

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String givenSuit) {
        if (givenSuit.equals("Hearts")||givenSuit.equals("Clubs")|| givenSuit.equals("Diamond")|| givenSuit.equals("Spades"))
        {
            suit = givenSuit;
        }
        else
        {
            System.out.println("Please enter one of:");
        }
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
   
   
}
