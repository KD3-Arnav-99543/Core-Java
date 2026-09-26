package ak;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        int choice;

        while (true) {

            System.out.println("\n===== BOOK MANAGEMENT =====");
            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Display Books in Reverse");
            System.out.println("4. Delete Book");
            System.out.println("5. Sort Books by Price");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // 1. Add New Book
                case 1:

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.next();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String authorName = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    Book b = new Book(isbn, price, authorName, quantity);

                    books.add(b);

                    System.out.println("Book added successfully!");

                    break;


                // 2. Display All Books
                case 2:

                    for (Book book : books) {
                        System.out.println(book);
                    }

                    break;


                // 3. Display Books in Reverse
                case 3:

                    for (int i = books.size() - 1; i >= 0; i--) {
                        System.out.println(books.get(i));
                    }

                    break;


                // 4. Delete Book at given index
                case 4:

                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    books.remove(index);

                    System.out.println("Book deleted successfully!");

                    break;


                // 5. Sort Books by Price in descending order
                case 5:

                    books.sort((b1, b2) ->
                        Double.compare(b2.getPrice(), b1.getPrice())
                    );

                    System.out.println("Books sorted by price!");

                    break;


                // Exit
                case 0:

                    System.out.println("Program Ended");
                    return;


                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}