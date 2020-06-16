package com.hotelmanagement.api.dto;

import java.io.Serializable;

public class BookingServiceDto implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -4481614903614196191L;

  private long id;
  private long customerId;
  private long serviceId;
  private long employeeId = 123456789;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public long getServiceId() {
    return this.serviceId;
  }

  public void setServiceId(long serviceId) {
    this.serviceId = serviceId;
  }

  public long getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

}