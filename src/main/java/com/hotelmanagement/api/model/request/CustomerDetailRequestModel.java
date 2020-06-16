package com.hotelmanagement.api.model.request;

public class CustomerDetailRequestModel {
  private String fullName;
  private String identificationNumber;
  private String email;
  private String dateOfBirth;
  private String phoneNumber;

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