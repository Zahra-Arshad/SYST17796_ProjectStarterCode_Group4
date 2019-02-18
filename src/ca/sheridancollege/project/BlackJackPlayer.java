/*
 * Breshna Rahimzy
 * Student ID: 991487145
 *     SYST10199 - WEB Programming
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * Breshna Rahimzy
 */
public class BlackJackPlayer extends Player {

    ArrayList<Card> cards = new ArrayList<>();
    private int points;
    
    public BlackJackPlayer(String name){
        super(name);
    }

    public void receiveCard(Card card) {
        cards.add(card);
    }

    public int getPoint() {
        return this.points;
    }
    
    public void play(){
        
    }

}
