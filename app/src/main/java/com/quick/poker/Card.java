package com.quick.poker;

public class Card {
    static char[] suits = {'\u2663', '\u2666', '\u2665', '\u2660'};
    int value;

    public Card(int value) {
        this.value = value;
    }

    public String get() {
        int symbol = value%13+1;
        return ((symbol<10)? " ": "") + symbol + "" + suits[value/13];
    }
}
