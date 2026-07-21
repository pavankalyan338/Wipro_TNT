import java.util.Scanner;

/*
 * Create a class Author with the following information.
 * Member variables : name (String), email (String), and gender (char)
 * Parameterized Constructor: To initialize the variables
 * 
 * Create a class Book with the following information.
 * Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
 * [Assumption: Each book will be written by exactly one Author]
 * Parameterized Constructor: To initialize the variables
 * Getters and Setters for all the member variables
 * 
 * In the main method, create a book object and print all details of the book (including the author details)
 */

// Author class representing the author of a book
class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor to initialize the variables
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Custom toString to easily display Author details
    @Override
    public String toString() {
        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
    }
}

// Book class representing a book written by an Author
class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized Constructor to initialize the variables
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters for all member variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Gather Author Details dynamically
        System.out.println("--- Enter Author Details ---");
        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();
        
        System.out.print("Enter Author Email: ");
        String authorEmail = sc.nextLine();
        
        System.out.print("Enter Author Gender (M/F): ");
        char authorGender = sc.next().charAt(0);
        sc.nextLine(); // Consume newline left-over

        // Instantiate the Author object
        Author authorObj = new Author(authorName, authorEmail, authorGender);

        System.out.println("\n--- Enter Book Details ---");
        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double bookPrice = sc.nextDouble();

        System.out.print("Enter Quantity in Stock: ");
        int qty = sc.nextInt();

        // Instantiate the Book object
        Book bookObj = new Book(bookName, authorObj, bookPrice, qty);

        // Display the full details of the book including author details
        System.out.println("\n=============================================");
        System.out.println("               BOOK DETAILS                  ");
        System.out.println("=============================================");
        System.out.println("Book Name         : " + bookObj.getName());
        System.out.println("Price             : " + bookObj.getPrice());
        System.out.println("Quantity in Stock : " + bookObj.getQtyInStock());
        System.out.println("---------------------------------------------");
        System.out.println("               AUTHOR DETAILS                ");
        System.out.println("---------------------------------------------");
        System.out.println("Author Name       : " + bookObj.getAuthor().getName());
        System.out.println("Author Email      : " + bookObj.getAuthor().getEmail());
        System.out.println("Author Gender     : " + bookObj.getAuthor().getGender());
        System.out.println("=============================================");

        sc.close();
    }
}
