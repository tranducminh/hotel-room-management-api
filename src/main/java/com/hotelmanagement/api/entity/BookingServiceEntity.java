package com.hotelmanagement.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "booking_service")
public class BookingServiceEntity implements Serializable {
  /**
   *
   */
  private static final long serialVersionUID = 7998504964458675621L;

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "serviceId", nullable = false)
  private long serviceId;

  @Column(name = "roomId", nullable = false)
  private long roomId;

  @Column(name = "employeeId", nullable = false)
  private long employeeId;

  @Column(name = "status", nullable = false)
  private String status;

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getServiceId() {
    return this.serviceId;
  }

  public void setServiceId(long serviceId) {
    this.serviceId = serviceId;
  }

  public long getRoomId() {
    return this.roomId;
  }

  public void setRoomId(long roomId) {
    this.roomId = roomId;
  }

  public long getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

}