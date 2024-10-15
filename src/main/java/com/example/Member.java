package com.example;

/**
 * Class for members' details.
 */
public class Member {
  /** member's first name. */
  private final String firstName;
  /** member's second name. */
  private final String secondName;
  /** member's id. */
  private final String memberId;

  /**
   * Constructor for Member class.
   *
   * @param first member's first name
   * @param second member's second name
   * @param mrId member's id
   */
  public Member(final String first, final String second, final String mrId) {
    this.firstName = first;
    this.secondName = second;
    this.memberId = mrId;
  }

  /**
   * Method for getting member's name.
   *
   * @return member's name
   */
  public String getName() {
    return firstName + " " + secondName;
  }

  /**
   * Method for getting member's id.
   *
   * @return member's id
   */
  public String getMemberId() {
    return memberId;
  }
}
