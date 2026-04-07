/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class GameTest {
    
    public GameTest() {
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
     * Test of getName method, of class Game.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        
        Game instance = new GameImpl();
        
        String expResult = "Test Game";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        
        Game instance = new GameImpl();
        
        ArrayList<Player> expResult = new ArrayList<>();
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        
        ArrayList<Player> players = new ArrayList<>();
        Game instance = new GameImpl();
        
        instance.setPlayers(players);
        assertEquals(players, instance.getPlayers());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of play method, of class Game.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        
        Game instance = new GameImpl();
        instance.play();
        
        assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of declareWinner method, of class Game.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        
        Game instance = new GameImpl();
        instance.declareWinner();
        
        assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    public class GameImpl extends Game {

        public GameImpl() {
            
            super("Test Game");
        }

        @Override
        public void play() {
        }

        @Override
        public void declareWinner() {
        }
    }
    
}