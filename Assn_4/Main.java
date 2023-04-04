package Assn_4;
import java.util.Scanner;

/*
In this Java Program we were supposed to simulate a deck of cards using java vector. We have built the following functions-
1. printDeck
2. printCard
3. sortDeck
4. dealCards
5. drawRandomCard
and others which complete the implementation of deck of cards in java. 
*/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Card C;
        Deck deck = new Deck();
        deck.printDeck();
        System.out.print("Enter number of cards to be dealt: ");
        int numberCards = scan.nextInt();
        System.out.println("\nCards drawn: \n");
        for (int i = 0; i < numberCards; i++) {
            C = deck.drawRandomCard();
            System.out.println(C);
        }
        scan.close();
        System.out.println("\nDealing Random Cards\n");
        deck.dealCards();
        System.out.println("\nSorting the deck\n");
        deck.sortDeck();
        deck.printDeck();
    }
}