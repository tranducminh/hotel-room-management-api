package com.hotelmanagement.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ServiceEntity implements Serializable {
  /**
   *
   */
  private static final long serialVersionUID = 1497147565812308673L;

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "serviceName", nullable = false)
  private String serviceName;

  @Column(name = "serviceName", nullable = false)
  private String description;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getServiceName() {
    return this.serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}