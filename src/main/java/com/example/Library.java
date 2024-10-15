package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for listing all books in a library.
 */
public class Library {
  /** book list. */
  private final List<BookInfo> books;
  /** member list. */
  private final List<Member> members;

  /**
   * Constructor for Library class.
   */
  public Library() {
    books = new ArrayList<>();
    members = new ArrayList<>();
  }

  /**
   * Method for adding a book.
   *
   * @param book book info
   */
  public void addBook(final BookInfo book) {
    books.add(book);
  }

  /**
   * Method for displaying all books.
   *
   * @return book list
   */
  public List<BookInfo> getBooks() {
    return books;
  }

  /**
   * Method for adding a member.
   *
   * @param member member's info
   */
  public void addMember(final Member member) {
    members.add(member);
  }

  /**
   * Method for displaying all members.
   *
   * @return members list
   */
  public List<Member> getMembers() {
    return members;
  }
}
