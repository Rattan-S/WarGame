package ca.sheridancollege.project;

public class WarPlayer extends Player {
    private GroupOfCards playerPile;
    private GroupOfCards wonPile;

    public WarPlayer(String name) {
        super(name);
        // Initialize piles, assuming a standard deck split might happen in Game
        this.playerPile = new GroupOfCards(26); 
        this.wonPile = new GroupOfCards(52);
    }

    @Override
    public void play() {
        // Logic to play a card will go here
    }
    
    public GroupOfCards getPlayerPile() {
        return this.playerPile;
    }

    public GroupOfCards getWonPile() {
        return this.wonPile;
    }
}