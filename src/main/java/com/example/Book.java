package com.example;

/**
 * Class for saving books' details.
 */
public class Book {
  private String title;
  private String author;
  private String isbn;

  /**
   * Constructor for Book class.
   *
   * @param title book title
   * @param author book author
   * @param isbn book number
   */
  public Book(String title, String author, String isbn) {
    setTitle(title);
    setAuthor(author);
    setIsbn(isbn);
  }

  //getting title
  public String getTitle() {
    return title;
  }

  //setting title
  public void setTitle(String title) {
    this.title = title;
  }

  //getting author
  public String getAuthor() {
    return author;
  }

  //setting author
  public void setAuthor(String author) {
    this.author = author;
  }

  //getting isbn
  public String getIsbn() {
    return isbn;
  }

  //setting isbn
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}
