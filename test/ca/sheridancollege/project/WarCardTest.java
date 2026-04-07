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

    // GOOD TEST: Checking standard face card translation 
    @Test
    public void testToString_Good() {
        System.out.println("testToString_Good");
        WarCard instance = new WarCard("Clubs", 11);
        String expResult = "Jack of Clubs";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    // BOUNDARY TEST: Checking the absolute highest card in the deck
    @Test
    public void testToString_Boundary_High() {
        System.out.println("testToString_Boundary_High");
        WarCard instance = new WarCard("Spades", 14);
        String expResult = "Ace of Spades";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    // BAD TEST: Checking how the system handles a null suit
    @Test
    public void testToString_Bad_NullSuit() {
        System.out.println("testToString_Bad_NullSuit");
        WarCard instance = new WarCard(null, 5);
        String result = instance.toString();
        
        assertNotNull(result);
    }
}