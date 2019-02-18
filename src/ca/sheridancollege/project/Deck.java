package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Anh Phan
 */
class testing {

    public static void main(String[] args) {
        Deck deck = new Deck(52);
        System.out.println(deck.toString());

        System.out.println(deck.deal());
        
        System.out.println(deck.toString());
        System.out.println(deck.getSize());

    }
}

public class Deck extends GroupOfCards {

    public Deck(int size) {
        super(size);
        super.setCards(new ArrayList<>());

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                super.showCards().add(new RegularCard(RegularCard.RANKS[i], RegularCard.SUITS[j]));
            }
        }

        super.shuffle();
    }

    public Card deal() {
        this.setSize(this.getSize() - 1);
        return super.showCards().remove(0);
    }

    public String toString() {
        return super.showCards().toString();
    }
}
