package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {

  private static final List<Member> members = new ArrayList<>();
  private static Integer memberIdCounter = 1;

  public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

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
      int option = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (option) {
        case 1:
          System.out.print("Enter book title: ");
          String title = scanner.nextLine();
          System.out.print("Enter book author: ");
          String author = scanner.nextLine();
          System.out.print("Enter book ISBN: ");
          String isbn = scanner.nextLine();
          Book book = new Book(title, author, isbn);
          library.addBook(book);
          System.out.println("Book added successfully.");
          break;
        case 2:
          System.out.println("Books in the library:");
          for (Book b : library.getBooks()) {
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", ISBN: " + b.getIsbn());
          }
          break;
        case 3:
          System.out.print("Enter member first name: ");
          String firstName = scanner.nextLine();
          System.out.print("Enter member second name: ");
          String secondName = scanner.nextLine();
          Integer memberId = memberIdCounter++;
          Member member = new Member(firstName, secondName, memberId);
          members.add(member);
          System.out.println("Member added successfully.");
          break;
        case 4:
          System.out.println("Members in the library:");
          for (Member m : members) {
            System.out.println("Name: " + m.getName() + ", Member ID: " + m.getMemberId());
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

