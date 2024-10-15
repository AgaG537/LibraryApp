package com.example;

/**
 * Class for saving books' details.
 */
public class BookInfo {
  /** book title. */
  private final String title;
  /** book author. */
  private final String author;
  /** book id. */
  private final String bookId;

  /**
   * Constructor for Book class.
   *
   * @param ttl book title
   * @param auth book author
   * @param bkId book id
   */
  public BookInfo(final String ttl, final String auth, final String bkId) {
    this.title = ttl;
    this.author = auth;
    this.bookId = bkId;
  }

  /**
   * Method for getting book title.
   *
   * @return book title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Method for getting book author.
   *
   * @return book title
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Method for getting book id.
   *
   * @return book id
   */
  public String getId() {
    return bookId;
  }
}
