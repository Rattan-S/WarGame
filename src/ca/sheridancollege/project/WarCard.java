/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author rattansingh
 */
public class WarCard extends Card {
    private String suit;
    private int rank; // Let's use 2-14 where 11=Jack, 12=Queen, 13=King, 14=Ace

    public WarCard(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        String rankString;
        switch (rank) {
            case 11: rankString = "Jack"; break;
            case 12: rankString = "Queen"; break;
            case 13: rankString = "King"; break;
            case 14: rankString = "Ace"; break;
            default: rankString = String.valueOf(rank); break;
        }
        return rankString + " of " + suit;
    }
}