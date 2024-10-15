package com.example;

public class Book {
  private String title;
  private String author;
  private String isbn;

  public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  // Getter for title
  public String getTitle() {
    return title;
  }

  // Setter for title
  public void setTitle(String title) {
    this.title = title;
  }

  // Getter for author
  public String getAuthor() {
    return author;
  }

  // Setter for author
  public void setAuthor(String author) {
    this.author = author;
  }

  // Getter for isbn
  public String getIsbn() {
    return isbn;
  }

  // Setter for isbn
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}
