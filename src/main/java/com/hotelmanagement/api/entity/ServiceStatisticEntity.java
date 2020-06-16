package com.hotelmanagement.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "service_statistic")
public class ServiceStatisticEntity implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -6660756644385484261L;

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "serviceId", nullable = false)
  private long serviceId;

  @Column(name = "serviceId", nullable = false)
  private int booking_total;

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

  public int getBooking_total() {
    return this.booking_total;
  }

  public void setBooking_total(int booking_total) {
    this.booking_total = booking_total;
  }

}