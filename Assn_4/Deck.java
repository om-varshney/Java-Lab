package Assn_4;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Deck {
    private final Vector<Card> cards;

    public Deck() {
        cards = new Vector<Card>();
        for (int a = 0; a <= 3; a++) {
            for (int b = 0; b <= 12; b++) {
                cards.add(new Card(a, b));
            }
        }
    }

    public static boolean compareCard(Card firstCard, Card secondCard) {
        // Returns true if first card is greater than second card. false otherwise.
        return Card.greaterThan(firstCard, secondCard);
    }

    public Card drawRandomCard() {
        Random generator = new Random();
        int index = generator.nextInt(cards.size());
        return cards.remove(index);
    }

    public boolean sameCard(Card firstCard, Card secondCard) {
        // Returns true if cards are equal. false otherwise.
        return Card.equalTo(firstCard, secondCard);
    }

    public void sortDeck() {
        // A simple code to use bubble sort to swap the cards.
        int maxLimit = cards.size();
        for (int i = 0; i < maxLimit; i++) {
            for (int j = 1; j < maxLimit - i - 1; j++) {
                if (compareCard(cards.get(j), cards.get(j + 1))) {
                    Collections.swap(cards, j, j + 1);
                }
            }
        }
    }

    public boolean findCard(Card card) {
        return cards.contains(card);
    }

    public void dealCards() {
        // Deal 5 random cards from the deck
        for (int i = 0; i < 5; i++) {
            int maxLimit = cards.size();
            int randIdx = (int) (Math.random() * (maxLimit + 1));
            System.out.println(cards.remove(randIdx));
        }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public String toString() {
        return "Cards remaining in deck: " + cards;
    }
}