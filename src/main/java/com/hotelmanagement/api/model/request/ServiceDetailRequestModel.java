package com.hotelmanagement.api.model.request;

public class ServiceDetailRequestModel {
  private String serviceName;
  private String description;

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