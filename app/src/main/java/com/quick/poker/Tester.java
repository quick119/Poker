package com.quick.poker;

public class Tester {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.print();
        /*char[] suits = {'c', 'd', 'h', 's'};
        int[] cards = new int[52];
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
        }
        for (int i = 0; i < 52; i++) {
            System.out.print(cards[i]%13+1+"" + suits[cards[i]/13] + " ");
            if (i%13 == 12) {
                System.out.println();
            }
        }*/
    }
}
