package com.example;

public class Member {
  private String name;
  private String memberId;

  public Member(String name, String memberId) {
    this.name = name;
    this.memberId = memberId;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Setter for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter for memberId
  public String getMemberId() {
    return memberId;
  }

  // Setter for memberId
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }
}
