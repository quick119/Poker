package com.quick.poker;

public class Card {
    static char[] suits = {'c', 'd', 'h', 's'};
    int value;

    public Card(int value) {
        this.value = value;
    }

    public String get() {
        int symbol = value%13+1;
        return ((symbol<10)? " ": "") + symbol + "" + suits[value/13];
    }
}
