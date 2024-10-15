package com.example;

public class Member {
  private String firstName;
  private String secondName;
  private Integer memberId;

  public Member(String firstName, String secondName, Integer memberId) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.memberId = memberId;
  }

  // Getter for name
  public String getName() {
    return firstName + " " + secondName;
  }

  // Setter for name
  public void setName(String firstName, String secondName) {
    this.firstName = firstName;
    this.secondName = secondName;
  }

  // Getter for memberId
  public Integer getMemberId() {
    return memberId;
  }

  // Setter for memberId
  public void setMemberId(Integer memberId) {
    this.memberId = memberId;
  }
}
