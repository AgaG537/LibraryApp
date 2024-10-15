package com.example;

/**
 * Class for saving books' details.
 */
public class Book {
  private String title;
  private String author;
  private String id;

  /**
   * Constructor for Book class.
   *
   * @param title book title
   * @param author book author
   * @param id book id
   */
  public Book(String title, String author, String id) {
    setTitle(title);
    setAuthor(author);
    setId(id);
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
  public String getId() {
    return id;
  }

  //setting isbn
  public void setId(String id) {
    this.id = id;
  }
}
