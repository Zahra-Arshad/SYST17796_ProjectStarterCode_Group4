package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Anh Phan
 */
public class Deck extends GroupOfCards {

    ArrayList<Card> deck = super.showCards(); // Assign the list from base class to this class's list

    public Deck(int givenSize) {
        super(givenSize);

        for (String i : RegularCard.RANKS) {
            for (String j : RegularCard.SUITS) {
                deck.add(new RegularCard(i, j)); // Populating the deck
            }
        }

        super.shuffle(); // Shuffling the deck
    }

    public Card deal() {
        super.setSize(super.getSize() - 1); // Decreasing size
        return deck.remove(0); // Returning and removing a card out of the deck
    }

}
