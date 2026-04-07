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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        
        // FIX: Use the auto-generated PlayerImpl instead of null
        Player instance = new PlayerImpl();
        
        // FIX: Expect the name we hardcoded into the PlayerImpl constructor below
        String expResult = "Test Player";
        String result = instance.getName();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        
        // FIX: Provide a new name to test
        String name = "New Rattan";
        
        // FIX: Create the object instead of using null
        Player instance = new PlayerImpl();
        instance.setName(name);
        
        // FIX: Assert that the name successfully changed to the new one
        assertEquals(name, instance.getName());
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of play method, of class Player.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        
        // FIX: Create the object instead of using null
        Player instance = new PlayerImpl();
        
        // Run the play method (which does nothing in the test class)
        instance.play();
        
        // If it runs without crashing, it passes!
        assertTrue(true);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    // NetBeans auto-generated this concrete class specifically for testing
    public class PlayerImpl extends Player {

        public PlayerImpl() {
            // FIX: Added a default name so the getName() test has something to verify
            super("Test Player");
        }

        @Override
        public void play() {
        }
    }
    
}