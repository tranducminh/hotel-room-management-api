package com.hotelmanagement.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "booking_room")
public class BookingRoomEntity implements Serializable {
  /**
   *
   */
  private static final long serialVersionUID = 5969633991217051068L;

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "roomId", nullable = false)
  private long roomId;

  @Column(name = "customerId", nullable = false)
  private long customerId;

  @Column(name = "employeeId", nullable = false)
  private long employeeId;

  @Column(name = "status", nullable = false)
  private String status;

  @Column(name = "timeStart", nullable = false)
  private String timeStart;

  @Column(name = "timeEnd", nullable = false)
  private String timeEnd;

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