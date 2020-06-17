package com.hotelmanagement.api.dto;

import java.io.Serializable;

public class BookingServiceDto implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -4481614903614196191L;

  private long id;
  private long roomId;
  private long serviceId;
  private long employeeId;
  private String status;

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getRoomId() {
    return this.roomId;
  }

  public void setRoomId(long roomId) {
    this.roomId = roomId;
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