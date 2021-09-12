package com.tuts.models;

import java.util.Date;

public class UserEntity implements java.io.Serializable {

  enum MaritalStatus {
    SINGLE,
    MARRIED,
    DIVORCED,
  }

  private String firstName;
  private String lastName;
  private Date dob;
  private MaritalStatus maritalStatus;

  public UserEntity() {}

  public UserEntity(
    final String firstName,
    final String lastName,
    final Date dob,
    final String maritalStatus
  ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.maritalStatus = MaritalStatus.valueOf(maritalStatus.toUpperCase());
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setDob(final Date dob) {
    this.dob = dob;
  }

  public Date getDob() {
    return this.dob;
  }

  public void setMaritalStatus(final String maritalStatus) {
    this.maritalStatus = MaritalStatus.valueOf(maritalStatus.toUpperCase());
  }

  public MaritalStatus getMaritalStatus() {
    return this.maritalStatus;
  }
}
