package com.hotelmanagement.api.model.response;

public class BookingRoomRest {
  private long id;
  private long roomId;
  private long customerId;
  private long employeeId;
  private String timeStart;
  private String timeEnd;
  private String status;

  public String getTimeEnd() {
    return timeEnd;
  }

  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }

  public String getTimeStart() {
    return timeStart;
  }

  public void setTimeStart(String timeStart) {
    this.timeStart = timeStart;
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