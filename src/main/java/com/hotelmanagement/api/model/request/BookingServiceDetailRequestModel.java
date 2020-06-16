package com.hotelmanagement.api.model.request;

public class BookingServiceDetailRequestModel {
  private long roomId;
  private long serviceId;

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

}