/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 * 
 *  @modifier Zahra Arshad, February 2019
 * @modifier Anh Phan, February 2019
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
        this.cards = new ArrayList<>();
        
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                this.cards.add(new RegularCard(RegularCard.RANKS[i], RegularCard.SUITS[j]));
            }
        }
        
        this.shuffle();
    }
    
    public Card deal() {
        this.size -= 1;
        return this.cards.remove(0);
    }

    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    public String toString() {
        return this.cards.toString();
    }
    
}//end class
