/*
 * Zahra Arshad
 * Student ID: 991485857
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project;

/**
 *
 * @author zahra
 */
public class RegularCard extends Card {

    String rank;
    String suit;
    int value;

    public static String RANKS[] = {"Spades", "Clubs", "Diamonds", "Hearts"};
    public static String SUITS[] = {"Ace", "King", "Queen", "Jack", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

    @Override
    public String toString() {
        return this.rank + " of " + this.suit;
    }

    public RegularCard(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

}
