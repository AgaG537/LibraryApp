package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for listing all books in a library.
 */
public class Library {
  private final List<Book> books;

  /**
   * Constructor for Library class.
   */
  public Library() {
    books = new ArrayList<>();
  }

  //adding a book
  public void addBook(Book book) {
    books.add(book);
  }

  //listing all books
  public List<Book> getBooks() {
    return books;
  }
}
