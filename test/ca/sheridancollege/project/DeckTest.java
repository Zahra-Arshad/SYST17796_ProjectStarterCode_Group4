/*
 * Anh Phan 
 *  991 489 221
 *  SYST10199 - WEB PROGRAMMING
 */
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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of deal method, of class Deck.
     */
    @Test
    public void testDealGood() {
        System.out.println("deal good case");
        Deck instance = new Deck(52);
        Card result = instance.deal();
        assertNotNull(result);
        assertEquals(true, result instanceof Card);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
     /**
     * Test of deal method, of class Deck.
     */
    @Test
    public void testDealBoundary() {
        System.out.println("deal boundary case");
        Deck instance = new Deck(52);
        Card result = instance.deal();
        assertNotNull(result);
        assertEquals(true, result instanceof Card);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
     /**
     * Test of deal method, of class Deck.
     */
    @Test
    public void testDealBad() {
        System.out.println("deal bad case");
        Deck instance = new Deck(52);
        Card result = instance.deal();
        assertNotNull(result);
        assertEquals(false, !(result instanceof Card));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
