package com.hotelmanagement.api.model.response;

public class BookingServiceRest {
  private long id;
  private long roomId;
  private long serviceId;
  private long employeeId;

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