package com.hotelmanagement.api.dto;

import java.io.Serializable;

public class ServiceDto implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  private long id;
  private String serviceName;
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