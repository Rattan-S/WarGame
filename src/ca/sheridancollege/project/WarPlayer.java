package ca.sheridancollege.project;

/**
 *
 * @author Rattan Singh
 * @author Abhinav
 * @author Dilpreet Kaur
 * @author Yuvraj
 */

public class WarPlayer extends Player {
    private GroupOfCards playerPile;
    private GroupOfCards wonPile;

    public WarPlayer(String name) {
        super(name);
        // Initialize their empty piles
        playerPile = new GroupOfCards(0);
        wonPile = new GroupOfCards(0);
    }

    public GroupOfCards getPlayerPile() {
        return playerPile;
    }

    public GroupOfCards getWonPile() {
        return wonPile;
    }

    @Override
    public void play() {
        
    }
}