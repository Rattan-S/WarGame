/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
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
 * @author Rattan Singh
 * @author Abhinav
 * @author Dilpreet Kaur
 * @author Yuvraj
 */
public class WarCardTest {
    
    public WarCardTest() {
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
     * Test of getSuit method, of class WarCard.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        
        // FIX: Create a real WarCard object instead of null
        WarCard instance = new WarCard("Spades", 10);
        
        // FIX: Set the expected result to match the suit we gave the card
        String expResult = "Spades";
        String result = instance.getSuit();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRank method, of class WarCard.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        
        // FIX: Create a real WarCard object instead of null
        WarCard instance = new WarCard("Hearts", 5);
        
        // FIX: Set the expected result to match the rank we gave the card
        int expResult = 5;
        int result = instance.getRank();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class WarCard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        // FIX: Create a real WarCard object. Remember from our game logic, 11 = Jack!
        WarCard instance = new WarCard("Clubs", 11);
        
        // FIX: Expected result should match how the toString method formats it
        String expResult = "Jack of Clubs";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}