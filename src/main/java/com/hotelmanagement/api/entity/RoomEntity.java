package com.hotelmanagement.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "rooms")
public class RoomEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -7087549719302973916L;

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "roomNumber", nullable = false)
  private String roomNumber;

  @Column(name = "roomStatus", nullable = false)
  private String roomStatus;

  @Column(name = "roomType", nullable = false)
  private String roomType;

  @Column(name = "capacity", nullable = false)
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

  public String getRoomStatus() {
    return this.roomStatus;
  }

  public void setRoomStatus(String roomStatus) {
    this.roomStatus = roomStatus;
  }

  public String getRoomType() {
    return this.roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

}