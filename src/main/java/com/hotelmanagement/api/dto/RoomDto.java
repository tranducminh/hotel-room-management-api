package com.hotelmanagement.api.dto;

import java.io.Serializable;

public class RoomDto implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 5859494889133916699L;

  private long id;
  private String roomNumber;
  private String roomType;
  private String roomStatus;
  private int capacity;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRoomNumber() {
    return this.roomNumber;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }

  public String getRoomType() {
    return this.roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }

  public String getRoomStatus() {
    return this.roomStatus;
  }

  public void setRoomStatus(String roomStatus) {
    this.roomStatus = roomStatus;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

}