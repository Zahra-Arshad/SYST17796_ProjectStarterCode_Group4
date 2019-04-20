package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class BlackJackPlayerTest {

    public BlackJackPlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCards method, of class BlackJackPlayer.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        BlackJackPlayer instance = new BlackJackPlayer("name");
        ArrayList<Card> result = instance.getCards();
        assertEquals(true, result instanceof ArrayList);
       
    }

    /**
     * Test of getPoints method, of class BlackJackPlayer.
     */
    @Test
    public void testGetPointsGood() {
        System.out.println("getPoints good case");
        Deck deck = new Deck(52);
        BlackJackPlayer instance = new BlackJackPlayer("name");

        for (int i = 0; i < 6; i++) {
            instance.receiveCard(deck.deal());
        }

        int result = instance.getPoints();
        assertEquals(true, result > 0 && result <= 50);
    
    }

    /**
     * Test of getPoints method, of class BlackJackPlayer.
     */
    @Test
    public void testGetPointsBad() {
        System.out.println("getPoints bad case");
        Deck deck = new Deck(52);
        BlackJackPlayer instance = new BlackJackPlayer("name");

        for (int i = 0; i < 6; i++) {
            instance.receiveCard(deck.deal());
        }

        int result = instance.getPoints();
        assertEquals(false, result < 0 || result > 50);
        
    }

    /**
     * Test of getPoints method, of class BlackJackPlayer.
     */
    @Test
    public void testGetPointsBoundary() {
        System.out.println("getPoints boundary case");
        Deck deck = new Deck(52);
        BlackJackPlayer instance = new BlackJackPlayer("name");

        while(true){
            Card card = deck.deal();
            if (card.returnValue() == 10){
                instance.receiveCard(card);
                break;
            }
            deck.showCards().add(card);

        }
        

        while(true){
            Card card = deck.deal();
            if (card.returnValue() == 10){
                instance.receiveCard(card);
                break;
            }
            deck.showCards().add(card);
        }
        

        while(true){
            Card card = deck.deal();
            if (card.toString().contains(String.valueOf(RegularCard.RANKS.values()[0]))){
                instance.receiveCard(card);
                break;
            }
            deck.showCards().add(card);

        }
       
        assertEquals(true, instance.getPoints() == 21);

    }

}
