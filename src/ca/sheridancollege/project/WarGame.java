/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;


/**
 *
 * @author Rattan Singh
 * @author Abhinav
 * @author Dilpreet Kaur
 * @author Yuvraj
 */
import java.util.ArrayList;

public class WarGame extends Game {
    private final int MAX_ROUNDS = 500; // Matches your Use Case termination condition

    public WarGame(String name) {
        super(name);
    }

    @Override
    public void play() {
        // Ensure exactly two players are in the game
        if (getPlayers().size() != 2) {
            System.out.println("War requires exactly 2 players.");
            return;
        }

        WarPlayer p1 = (WarPlayer) getPlayers().get(0);
        WarPlayer p2 = (WarPlayer) getPlayers().get(1);

        // Use Case 1: Initialize Game (Shuffle and Deal)
        initializeDeck(p1, p2);

        int currentRound = 0;

        // Use Case 2: Verify Card Count & Round Limits
        while (currentRound < MAX_ROUNDS && hasCards(p1) && hasCards(p2)) {
            currentRound++;

            // Check if draw piles are empty and need the wonPile shuffled in
            reloadHandIfNeeded(p1);
            reloadHandIfNeeded(p2);

            // If a player still has 0 cards after attempting a reload, game over
            if (p1.getPlayerPile().getSize() == 0 || p2.getPlayerPile().getSize() == 0) {
                break; 
            }

            // Draw top cards
            WarCard card1 = (WarCard) p1.getPlayerPile().getCards().remove(0);
            WarCard card2 = (WarCard) p2.getPlayerPile().getCards().remove(0);

            // Create the prize pool for the round
            ArrayList<WarCard> prizePool = new ArrayList<>();
            prizePool.add(card1);
            prizePool.add(card2);

            // Compare Ranks
            if (card1.getRank() > card2.getRank()) {
                p1.getWonPile().getCards().addAll(prizePool);
            } else if (card2.getRank() > card1.getRank()) {
                p2.getWonPile().getCards().addAll(prizePool);
            } else {
                // Use Case 3: Resolve "War" Tie-Breaker
                resolveWar(p1, p2, prizePool);
            }
        }

        System.out.println("Game terminated after " + currentRound + " rounds.");
        declareWinner();
    }

    // Handles the tie-breaker scenario
    private void resolveWar(WarPlayer p1, WarPlayer p2, ArrayList<WarCard> prizePool) {
        reloadHandIfNeeded(p1);
        reloadHandIfNeeded(p2);

        // If a player doesn't have enough cards to fight a war, they lose.
        if (p1.getPlayerPile().getSize() == 0 || p2.getPlayerPile().getSize() == 0) {
            return; 
        }

        // Draw 1 Face Down Card
        prizePool.add((WarCard) p1.getPlayerPile().getCards().remove(0));
        prizePool.add((WarCard) p2.getPlayerPile().getCards().remove(0));

        reloadHandIfNeeded(p1);
        reloadHandIfNeeded(p2);

        if (p1.getPlayerPile().getSize() == 0 || p2.getPlayerPile().getSize() == 0) {
            return;
        }

        // Draw 1 Face Up Card to compare
        WarCard up1 = (WarCard) p1.getPlayerPile().getCards().remove(0);
        WarCard up2 = (WarCard) p2.getPlayerPile().getCards().remove(0);
        prizePool.add(up1);
        prizePool.add(up2);

        if (up1.getRank() > up2.getRank()) {
            p1.getWonPile().getCards().addAll(prizePool);
        } else if (up2.getRank() > up1.getRank()) {
            p2.getWonPile().getCards().addAll(prizePool);
        } else {
            // Recursive call if they tie AGAIN!
            resolveWar(p1, p2, prizePool); 
        }
    }

    // Helper: Creates the 52 card deck and deals 26 to each player
    private void initializeDeck(WarPlayer p1, WarPlayer p2) {
        GroupOfCards deck = new GroupOfCards(52);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String suit : suits) {
            for (int rank = 2; rank <= 14; rank++) {
                deck.getCards().add(new WarCard(suit, rank));
            }
        }
        deck.shuffle();

        for (int i = 0; i < 26; i++) {
            p1.getPlayerPile().getCards().add(deck.getCards().remove(0));
            p2.getPlayerPile().getCards().add(deck.getCards().remove(0));
        }
    }

    // Helper: Moves cards from Won Pile to Draw Pile if Draw Pile is empty
    private void reloadHandIfNeeded(WarPlayer p) {
        if (p.getPlayerPile().getSize() == 0 && p.getWonPile().getSize() > 0) {
            p.getWonPile().shuffle();
            p.getPlayerPile().getCards().addAll(p.getWonPile().getCards());
            p.getWonPile().getCards().clear();
        }
    }

    // Helper: Checks if a player has any cards left anywhere
    private boolean hasCards(WarPlayer p) {
        return (p.getPlayerPile().getSize() + p.getWonPile().getSize()) > 0;
    }

    // Use Case 5: Declare Winner
    @Override
    public void declareWinner() {
        WarPlayer p1 = (WarPlayer) getPlayers().get(0);
        WarPlayer p2 = (WarPlayer) getPlayers().get(1);

        int p1Total = p1.getPlayerPile().getSize() + p1.getWonPile().getSize();
        int p2Total = p2.getPlayerPile().getSize() + p2.getWonPile().getSize();

        System.out.println("FINAL SCORES:");
        System.out.println(p1.getName() + ": " + p1Total + " cards.");
        System.out.println(p2.getName() + ": " + p2Total + " cards.");

        if (p1Total > p2Total) {
            System.out.println(p1.getName() + " is the overall WINNER!");
        } else if (p2Total > p1Total) {
            System.out.println(p2.getName() + " is the overall WINNER!");
        } else {
            System.out.println("The game is a perfect tie!");
        }
    }
}