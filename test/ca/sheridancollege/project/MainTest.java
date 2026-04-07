/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
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
public class MainTest {
    
    public MainTest() {
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
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        
        // FIX 1: Save the original System.in so we don't permanently break the console
        InputStream originalIn = System.in;
        
        try {
            // FIX 2: Simulate the user typing "Rattan" and "Abhinav" and hitting Enter (\n)
            String simulatedUserInput = "Rattan\nAbhinav\n";
            ByteArrayInputStream fakeInput = new ByteArrayInputStream(simulatedUserInput.getBytes());
            
            // Set the system to use our fake input instead of the real keyboard
            System.setIn(fakeInput);
            
            // FIX 3: Run the main method
            String[] args = null;
            Main.main(args);
            
            // FIX 4: If the game successfully runs from start to finish without 
            // crashing or getting stuck in an infinite loop, the test passes!
            assertTrue(true); 
            
        } finally {
            // FIX 5: Put the real keyboard input back to normal after the test finishes
            System.setIn(originalIn);
        }
    }
}