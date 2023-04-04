package Assn_4;

public class Card {
    private int type, value;
    private String[] cardType = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10","9", "8", "7", "6", "5", "4", "3", "2"};

    public Card(int type, int value) {
        this.type = type;
        this.value = value;
    }

    public String toString() {
        String finalCard = cardValue[value] + " of " + cardType[type];
        return finalCard;
    }

    public static boolean equalTo(Card firstCard, Card secondCard) {
        return firstCard.type == secondCard.type && firstCard.value == secondCard.value;
    }

    public static boolean greaterThan(Card firstCard, Card secondCard) {
        return firstCard.type > secondCard.type || firstCard.value > secondCard.value;
    }
}
