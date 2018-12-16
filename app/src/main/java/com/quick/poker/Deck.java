package com.quick.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public static final int CARDS_COUNT = 52;
    private List<Card> cards = new ArrayList<>();
    public Deck() {
        for (int i = 0; i < CARDS_COUNT; i++) {
            cards.add(new Card(i));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void print() {
        int count = 0;
        for (Card card : cards) {
            System.out.print(card.get() + " ");
            if (count%13 == 12) {
                System.out.println();
            }
            count++;
        }
    }

    public List<Card> getCards() {
        return cards;
    }
}
