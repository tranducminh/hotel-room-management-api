package com.hotelmanagement.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "room_statistic")
public class RoomStatisticEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -3032920832143594349L;

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "roomId", nullable = false)
  private long roomId;

  @Column(name = "booking_total", nullable = false)
  private int booking_total;

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

  public int getBooking_total() {
    return this.booking_total;
  }

  public void setBooking_total(int booking_total) {
    this.booking_total = booking_total;
  }

}