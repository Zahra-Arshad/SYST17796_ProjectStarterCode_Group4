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
    private int points;
    private int aces;

    public BlackJackPlayer(String name) {
        super(name);
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void receiveCard(Card card) {
        cards.add(card);
        this.points += ((RegularCard)card).returnValue();

        // Dealing with ace
        if (card.toString().contains(RegularCard.RANKS[0])) {
            this.aces += 1;
        }

        if (this.aces > 0 && this.points > 21) {
            this.aces -= 1;
            this.points -= 9;
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
    
    public String toString(){
        return this.getPlayerID() + " has: " + this.cards.toString(); // Printing out the hand
    }

}
