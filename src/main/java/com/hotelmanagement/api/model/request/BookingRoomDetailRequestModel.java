package com.hotelmanagement.api.model.request;

public class BookingRoomDetailRequestModel {
  private long roomId;
  private long customerId;
  private String timeStart;
  private String timeEnd;

  public long getRoomId() {
    return this.roomId;
  }

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