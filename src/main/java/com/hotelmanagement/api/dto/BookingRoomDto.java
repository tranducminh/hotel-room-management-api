package com.hotelmanagement.api.dto;

import java.io.Serializable;

public class BookingRoomDto implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -4763073672640165471L;

  private long id;
  private long roomId;
  private long customerId;
  private long employeeId = 123456789;
  private String status;

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

  public long getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public long getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}