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
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
