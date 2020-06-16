package com.hotelmanagement.api.model.request;

public class BookingRoomDetailRequestModel {
  private long roomId;
  private long customerId;

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

}