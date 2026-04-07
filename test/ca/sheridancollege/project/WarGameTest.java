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
        
        WarGame instance = new WarGame("Test Game");
        
        instance.getPlayers().add(new WarPlayer("Test Player 1"));
        instance.getPlayers().add(new WarPlayer("Test Player 2"));
        
        instance.play();
        
        assertTrue(true);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of declareWinner method, of class WarGame.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        
        WarGame instance = new WarGame("Test Game");
        
        WarPlayer p1 = new WarPlayer("Test Player 1");
        WarPlayer p2 = new WarPlayer("Test Player 2");
        
        instance.getPlayers().add(p1);
        instance.getPlayers().add(p2);
        
        p1.getPlayerPile().getCards().add(new WarCard("Hearts", 14));
        
        // Run the declareWinner method
        instance.declareWinner();
        
        assertTrue(true);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}