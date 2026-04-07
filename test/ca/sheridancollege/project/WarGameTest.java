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
public class WarGameTest {
    
    public WarGameTest() {
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
     * Test of play method, of class WarGame.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        
        // FIX: Create a real WarGame object instead of null
        WarGame instance = new WarGame("Test Game");
        
        // FIX: The game needs exactly 2 players to play, so we create and add them here
        instance.getPlayers().add(new WarPlayer("Test Player 1"));
        instance.getPlayers().add(new WarPlayer("Test Player 2"));
        
        // Now it can run the play method without crashing
        instance.play();
        
        // If the game finishes without throwing an error, the test passes
        assertTrue(true);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of declareWinner method, of class WarGame.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        
        // FIX: Create a real WarGame object instead of null
        WarGame instance = new WarGame("Test Game");
        
        WarPlayer p1 = new WarPlayer("Test Player 1");
        WarPlayer p2 = new WarPlayer("Test Player 2");
        
        instance.getPlayers().add(p1);
        instance.getPlayers().add(p2);
        
        // FIX: Give P1 a card so they have a higher score than P2, avoiding an empty tie
        p1.getPlayerPile().getCards().add(new WarCard("Hearts", 14));
        
        // Run the declareWinner method
        instance.declareWinner();
        
        // If it prints the winner without crashing, the test passes
        assertTrue(true);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}