import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Collect Unique Symbols From Set of Cards
 * 
 * Create Card class with attributes symbol and number.
 * Collect each card details (symbol and number) from the user into a Set.
 * Once four different symbols are gathered, display the first occurrence of card 
 * details in alphabetical order by symbol.
 */

class Card implements Comparable<Card> {
    private char symbol;
    private int number;

    public Card() {
    }

    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Sort cards alphabetically based on symbol
    @Override
    public int compareTo(Card other) {
        return Character.compare(this.symbol, other.symbol);
    }

    // Uniqueness in Set based on card symbol
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return symbol == card.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }
}

public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Card> cardSet = new TreeSet<>();
        int totalCardsEntered = 0;

        // Keep collecting cards until 4 unique symbols are gathered
        while (cardSet.size() < 4) {
            System.out.println("Enter a card :");
            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();

            Card card = new Card(symbol, number);
            cardSet.add(card); // Stores only the first occurrence for each unique symbol
            totalCardsEntered++;
        }

        System.out.println("Four symbols gathered in " + totalCardsEntered + " cards.");
        System.out.println("Cards in Set are :");

        // Display cards in alphabetical order
        for (Card card : cardSet) {
            System.out.println(card.getSymbol() + " " + card.getNumber());
        }

        scanner.close();
    }
}