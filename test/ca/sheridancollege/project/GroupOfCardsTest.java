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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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

    // GOOD TEST: Checking standard card addition
    @Test
    public void testAddCard_Good() {
        System.out.println("testAddCard_Good");
        GroupOfCards pile = new GroupOfCards(0);
        pile.getCards().add(new WarCard("Hearts", 5));
        
        // Assert the size increased to 1
        assertEquals(1, pile.getSize());
    }

    // BOUNDARY TEST: Checking empty pile size
    @Test
    public void testEmptyPile_Boundary() {
        System.out.println("testEmptyPile_Boundary");
        GroupOfCards pile = new GroupOfCards(0);
        
        // Assert an initialized pile has exactly 0 cards
        assertEquals(0, pile.getSize());
    }

    // BAD TEST: Testing bounds (removing from an empty pile)
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveFromEmpty_Bad() {
        System.out.println("testRemoveFromEmpty_Bad");
        GroupOfCards pile = new GroupOfCards(0);
        
        // This will fail because the pile is empty, which is what we EXPECT to happen
        pile.getCards().remove(0);
    }
}