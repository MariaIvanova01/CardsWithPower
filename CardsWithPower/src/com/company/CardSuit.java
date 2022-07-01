package com.company;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int suitsPower;

    CardSuit(int suitsPower) {
        this.suitsPower = suitsPower;
    }

    public int getSuitsPower() {
        return suitsPower;
    }
}
