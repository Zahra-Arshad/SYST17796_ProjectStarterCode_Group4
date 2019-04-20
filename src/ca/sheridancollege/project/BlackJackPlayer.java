package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Breshna Rahimzy
 * @modifier Anh Phan
 * @modifier Zahra Arshad
 */
public class BlackJackPlayer extends Player implements Comparable<BlackJackPlayer> {

    private ArrayList<Card> cards = new ArrayList<>();
    private int points = 0;
    private int aces;

    public BlackJackPlayer(String name) {
        super(name);
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void receiveCard(Card card) {
        cards.add((RegularCard)card);
        this.points += card.returnValue();

        // Dealing with ace
        if (card.toString().contains(String.valueOf(RegularCard.RANKS.Ace))) {
            this.aces += 1;
        }

        if (this.aces > 0 && this.points > 21) {
            this.aces -= 1;
            this.points -= 9;
        }
    }
    
    public boolean isBusted(){
        return this.points > 21;
    }
    

    public boolean checkDoubleAce() {
        Card firstCard = null;
        Card secondCard = null;
        try {
            firstCard = this.cards.get(0);
            secondCard = this.cards.get(1);

            return firstCard.toString().contains(String.valueOf(RegularCard.RANKS.Ace)) && secondCard.toString().contains(String.valueOf(RegularCard.RANKS.Ace));
            
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            return false;
        }

    }

    public int getPoints() {
        return this.points;
    }

    public void play() {

    }

    public int compareTo(BlackJackPlayer o) {
        if (this.points == o.getPoints()) {
            return 0;
        } else if (this.points >= o.getPoints()) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return this.getPlayerID() + " has: " + this.cards.toString() + " - Points: " + this.getPoints(); // Printing out the hand
    }

}
