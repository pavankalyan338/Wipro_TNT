import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Collect and Group Cards
 * 
 * Write a program to collect and store all the cards to assist the users in finding 
 * all the cards in a given symbol. Get N number of cards details from the user and store 
 * the values in Card object with the attributes symbol and number. Store all the cards 
 * in a map with symbol as its key and list of cards as its value.
 * 
 * Print all distinct symbols in alphabetical order from the Map.
 * For each symbol, print all card details, number of cards, and their sum.
 */

class Card {
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
}

public class Project4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TreeMap automatically keeps the symbol keys in sorted (alphabetical) order
        Map<Character, List<Card>> cardMap = new TreeMap<>();

        System.out.println("Enter Number of Cards :");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();

            Card card = new Card(symbol, number);

            // Grouping cards into the map by symbol
            if (!cardMap.containsKey(symbol)) {
                cardMap.put(symbol, new ArrayList<>());
            }
            cardMap.get(symbol).add(card);
        }

        // Displaying distinct symbols
        System.out.print("Distinct Symbols are : ");
        for (char symbol : cardMap.keySet()) {
            System.out.print(symbol + " ");
        }
        System.out.println();

        // Processing and displaying cards per symbol
        for (Map.Entry<Character, List<Card>> entry : cardMap.entrySet()) {
            char symbol = entry.getKey();
            List<Card> cards = entry.getValue();

            System.out.println("Cards in " + symbol + " Symbol");

            int sum = 0;
            for (Card card : cards) {
                System.out.println(card.getSymbol() + " " + card.getNumber());
                sum += card.getNumber();
            }

            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        scanner.close();
    }
}