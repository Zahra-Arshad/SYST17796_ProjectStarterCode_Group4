/*
 * Zahra Arshad
 * Student ID: 991485857
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project;

/**
 *
 * @author zahra,
 */
public class RegularCard extends Card {

    private String rank;
    private String suit;

    public enum SUITS {Spades, Clubs, Diamonds, Hearts};
    public enum RANKS {Ace, King, Queen, Jack, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten};

    @Override
    public String toString() {
        return this.rank + " of " + this.suit;
    }

    public RegularCard(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public int suitLevel(){
        switch(this.suit){
            case "Hearts": return 4;
            case "Diamonds": return 3;
            case "Clubs": return 2;
            case "Spades": return 1;
            default: return -1;
        }
    }

    public int returnValue() {

        switch (this.rank) {
            case "Ace":
            case "King":
            case "Queen":
            case "Jack":
            case "Ten":
                return 10;
            case "Nine":
                return 9;
            case "Eight":
                return 8;
            case "Seven":
                return 7;
            case "Six":
                return 6;
            case "Five":
                return 5;
            case "Four":
                return 4;
            case "Three":
                return 3;
            case "Two":
                return 2;
            default:
                return -1;
        }

    }
}
