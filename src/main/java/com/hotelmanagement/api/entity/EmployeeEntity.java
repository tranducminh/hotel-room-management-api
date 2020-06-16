package com.hotelmanagement.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "employees")
public class EmployeeEntity implements Serializable {
  /**
   *
   */
  private static final long serialVersionUID = 385196009349026575L;

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "fullName", nullable = false)
  private String fullName;

  @Column(name = "username", nullable = false)
  private String username;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "dateOfBirth", nullable = false)
  private String dateOfBirth;

  @Column(name = "hashPassword", nullable = false)
  private String hashPassword;

  @Column(name = "address", nullable = false)
  private String address;

  @Column(name = "role", nullable = false)
  private String role;

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

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
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

  public String getHashPassword() {
    return this.hashPassword;
  }

  public void setHashPassword(String hashPassword) {
    this.hashPassword = hashPassword;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getRole() {
    return this.role;
  }

  public void setRole(String role) {
    this.role = role;
  }

}