package com.example;

import java.util.Scanner;

/**
 * Class for managing library.
 * It enables librarian to:
 * 1. add new book or member
 * 2. list all books or members
 */
public class LibraryManager {


  /**
   * Main method enabling the library's management.
   *
   * @param args user's command line arguments
   */
  public static void main(final String[] args) {
    final Library library = new Library();
    final Scanner scanner = new Scanner(System.in);
    BookInfo book;
    String title;
    String author;
    String firstName;
    String secondName;
    String bookId;
    String memberId;
    Member member;

    System.out.println("Welcome to the Library System");
    while (true) {
      System.out.println("----Available options----");
      System.out.println("1. Add a book");
      System.out.println("2. Display all books");
      System.out.println("3. Add a member");
      System.out.println("4. Display all members");
      System.out.println("5. Exit");
      System.out.println("-------------------------");
      System.out.print("Choose an option: ");
      final int option = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (option) {
        case 1:
          System.out.print("Enter book title: ");
          title = scanner.nextLine();
          System.out.print("Enter book author: ");
          author = scanner.nextLine();
          System.out.print("Enter book ID: ");
          bookId = scanner.nextLine();
          book = new BookInfo(title, author, bookId);
          library.addBook(book);
          System.out.println("Book added successfully.");
          break;
        case 2:
          System.out.println("Books in the library:");
          for (final BookInfo b : library.getBooks()) {
            System.out.println("\"" + b.getTitle() + "\", "
                + b.getAuthor() + ", ID: " + b.getId());
          }
          break;
        case 3:
          System.out.print("Enter member first name: ");
          firstName = scanner.nextLine();
          System.out.print("Enter member second name: ");
          secondName = scanner.nextLine();
          System.out.print("Enter member ID: ");
          memberId = scanner.nextLine();
          member = new Member(firstName, secondName, memberId);
          library.addMember(member);
          System.out.println("Member added successfully.");
          break;
        case 4:
          System.out.println("Members in the library:");
          for (final Member m : library.getMembers()) {
            System.out.println(m.getName() + ", ID: " + m.getMemberId());
          }
          break;
        case 5:
          System.out.println("Exiting...");
          scanner.close();
          return;
        default:
          System.out.println("Invalid option. Try again.");
      }
    }
  }
}

