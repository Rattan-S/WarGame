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
        
        WarCard instance = new WarCard("Spades", 10);
        
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
        
        WarCard instance = new WarCard("Hearts", 5);
        
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
        
        WarCard instance = new WarCard("Clubs", 11);
        
        String expResult = "Jack of Clubs";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}