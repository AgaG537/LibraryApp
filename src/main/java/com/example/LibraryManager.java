package com.example;

public class LibraryManager {

  public static void main(String[] args) {
    Library library = new Library();

    Book book1 = new Book("1984", "George Orwell", "1234567890");
    Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

    library.addBook(book1);
    library.addBook(book2);

    for (Book book : library.getBooks()) {
      System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
    }
  }
}

