package com.hotelmanagement.api.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -2286767126228974748L;

  private long id;
  private String fullName;
  private String identificationNumber;
  private String email;
  private String dateOfBirth;
  private String phoneNumber;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFullName() {
    return this.fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getIdentificationNumber() {
    return this.identificationNumber;
  }

  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}