package com.example;

/**
 * Class for members' details.
 */
public class Member {
  private String firstName;
  private String secondName;
  private String memberId;

  /**
   * Constructor for Member class.
   */
  public Member(String firstName, String secondName, String memberId) {
    setName(firstName, secondName);
    setMemberId(memberId);
  }

  //getting name
  public String getName() {
    return firstName + " " + secondName;
  }

  //setting name
  public void setName(String firstName, String secondName) {
    this.firstName = firstName;
    this.secondName = secondName;
  }

  //getting memberId
  public String getMemberId() {
    return memberId;
  }

  //setting memberId
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }
}
