package com.company;

public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public int calculatingPower(){
        return cardRank.getPowerRank() + cardSuit.getSuitsPower();
    }
}
