/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author rattansingh
 */
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Ultimate War Game!");
        System.out.println("---------------------------------");
        
        // 1. Ask for Player 1's name
        System.out.print("Enter name for Player 1: ");
        String p1Name = input.nextLine();
        
        // 2. Ask for Player 2's name
        System.out.print("Enter name for Player 2: ");
        String p2Name = input.nextLine();
        
        // Create the game
        WarGame myGame = new WarGame("Group 2 War Championship");
        
        // Create two players using the names typed by the user
        WarPlayer player1 = new WarPlayer(p1Name);
        WarPlayer player2 = new WarPlayer(p2Name);
        
        // Add players to the game
        myGame.getPlayers().add(player1);
        myGame.getPlayers().add(player2);
        
        System.out.println("\nStarting the battle between " + p1Name + " and " + p2Name + "...\n");
        
        // Start the game loop
        myGame.play();
        
        // Close the scanner to prevent resource leaks
        input.close();
    }
}
