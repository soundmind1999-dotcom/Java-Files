import java.util.ArrayList;
import java.util.Scanner;
import java.security.SecureRandom;

public class BookSuggestion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        ArrayList<String> bookList = new ArrayList<>();

        // Sample books
        bookList.add("The Hobbit");
        bookList.add("The Mystery");
        bookList.add("Animal Farm");
        bookList.add("Brave Kingdom")

        while (true) {

            System.out.print("""
                    Welcome to the Book Suggestion System

                    1. Get Suggestions
                    2. Add Book
                    3. Remove Book
                    4. Update Book
                    5. Show all Books
                    6. Exit

                    Enter here: 
                    """);

            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {

                // 1. Get Suggestions
                case 1 -> {
                    if (bookList.isEmpty()) {
                        System.out.println("No books available.");
                        break;
                    }

                    String decision = "yes";

                    while (decision.equalsIgnoreCase("yes")) {
                        int index = random.nextInt(bookList.size());
                        int page = random.nextInt(100) + 1;

                        System.out.println("\nBook for the Day:");
                        System.out.println("Book Title: " + bookList.get(index));
                        System.out.println("Page: " + page);

                        System.out.print("\nWould you like another suggestion? (yes/no): ");
                        decision = input.nextLine();
                    }
                }

                // 2. Add Book
                case 2 -> {
                    System.out.print("Enter the book title: ");
                    String book = input.nextLine();

                    if (bookList.contains(book)) {
                        System.out.println("Book already exists!");
                    } else {
                        bookList.add(book);
                        System.out.println("Book added successfully!");
                    }
                }

                // 3. Remove Book
                case 3 -> {
                    System.out.print("Enter the book title to remove: ");
                    String book = input.nextLine();

                    if (bookList.remove(book)) {
                        System.out.println("Book removed successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                }

                // 4. Update Book
                case 4 -> {
                    System.out.print("Enter the old book title: ");
                    String oldBook = input.nextLine();

                    if (bookList.contains(oldBook)) {
                        System.out.print("Enter the new book title: ");
                        String newBook = input.nextLine();

                        int index = bookList.indexOf(oldBook);
                        bookList.set(index, newBook);
                        System.out.println("Book updated successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                }

                // 5. Show all books
                case 5 -> {
                    if (bookList.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nAll Books:");
                        for (int count = 0; count < bookList.size(); count++) {
                            System.out.println((count + 1) + ". " + bookList.get(count));
                        }
                    }
                }

                // 6. Exit
                case 6 -> {
                    System.out.println("Thank you for using the Book Suggestion System!");
                    input.close();
                    return;
                }

                default -> System.out.println("Invalid option. Please choose 1–6.");
            }
        }
    }
}

