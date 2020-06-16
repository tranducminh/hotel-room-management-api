package com.hotelmanagement.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "customers")
public class CustomerEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -5272470451670719713L;

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "fullName", nullable = false)
  private String fullName;

  @Column(name = "identificationNumber", nullable = false)
  private String identificationNumber;

  @Column(name = "dateOfBirth", nullable = false)
  private String dateOfBirth;

  @Column(name = "email", nullable = true)
  private String email;

  @Column(name = "phoneNumber", nullable = false)
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

  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}