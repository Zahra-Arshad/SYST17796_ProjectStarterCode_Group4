
package ca.sheridancollege.project;

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
public class RegularCardTest {
    
    public RegularCardTest() {
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
     * Test of returnValue method, of class RegularCard.
     */
    @Test
    public void testReturnValueGood() {
        System.out.println("returnValue good case");
        Deck deck = new Deck(52);
        Card instance = deck.deal();
        boolean expResult = true;
        int result = instance.returnValue();
        assertEquals(expResult, result <= 10 && result > 0);
       
    }
    
    /**
     * Test of returnValue method, of class RegularCard.
     */
    @Test
    public void testReturnValueBoundary() {
        System.out.println("returnValue boundary case");
        Deck deck = new Deck(52);
        Card instance = deck.deal();
        
        int result = instance.returnValue();
        boolean expResult = result == 1 || result == 2 || result == 3 || result == 4 || result == 5 || result == 6 || result == 7 || result == 8 || result == 9 || result == 10;
        assertEquals(expResult, true);
      
    }
    
     /**
     * Test of returnValue method, of class RegularCard.
     */
    @Test
    public void testReturnValueBad() {
        System.out.println("returnValue bad case");
        Deck deck = new Deck(52);
        Card instance = deck.deal();
        boolean expResult = false;
        int result = instance.returnValue();
        assertEquals(expResult, result > 10 || result <= 0);
       
    }
    
}
