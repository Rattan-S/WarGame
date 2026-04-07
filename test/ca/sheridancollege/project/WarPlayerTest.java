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
 * @author rattansingh
 */
public class WarPlayerTest {
    
    public WarPlayerTest() {
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
     * Test of getPlayerPile method, of class WarPlayer.
     */
    @Test
    public void testGetPlayerPile() {
        System.out.println("getPlayerPile");
        
        // FIX: Create a real WarPlayer instead of null
        WarPlayer instance = new WarPlayer("Rattan");
        
        // FIX: Get the pile and check that it actually exists and starts at size 0
        GroupOfCards result = instance.getPlayerPile();
        assertNotNull(result);
        assertEquals(0, result.getSize());
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getWonPile method, of class WarPlayer.
     */
    @Test
    public void testGetWonPile() {
        System.out.println("getWonPile");
        
        // FIX: Create a real WarPlayer instead of null
        WarPlayer instance = new WarPlayer("Rattan");
        
        // FIX: Get the won pile and check that it actually exists and starts at size 0
        GroupOfCards result = instance.getWonPile();
        assertNotNull(result);
        assertEquals(0, result.getSize());
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of play method, of class WarPlayer.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        
        // FIX: Create a real WarPlayer instead of null
        WarPlayer instance = new WarPlayer("Rattan");
        
        // Run the play method
        instance.play();
        
        // If it runs without crashing, it passes!
        assertTrue(true);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}