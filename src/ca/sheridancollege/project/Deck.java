
package ca.sheridancollege.project;

/**
 *
 * @author Anh Phan
 */
public class Deck extends GroupOfCards{    
    public Deck(int size){
        super(size);
        
        for(int i = 0; i < 13; i++){
            for (int j = 0; j < 4; j++){
                super.showCards().add(new RegularCard(RegularCard.RANKS[i],RegularCard.SUITS[j]));
            }
        }
                
        super.shuffle();
    }
    
    public Card deal(){
        return super.showCards().remove(0);
    }
    
    public String toString(){
        return super.showCards().toString();
    }
}
