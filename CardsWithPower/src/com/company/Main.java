package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CardRank cardRank = CardRank.valueOf(scan.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scan.nextLine());

        Card card = new Card(cardRank,cardSuit);

        System.out.printf("Card name: %s of %s; Card power: %d",cardRank.name(),
                cardSuit.name(), card.calculatingPower());
    }
}
