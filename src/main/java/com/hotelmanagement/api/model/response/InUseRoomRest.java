package com.hotelmanagement.api.model.response;

import java.util.List;

public class InUseRoomRest {
  private long id;
  private String timeStart;
  private String timeEnd;
  private String status;
  private List<ServiceRest> services;
  private CustomerRest customer;
  private RoomRest room;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTimeStart() {
    return this.timeStart;
  }

  public void setTimeStart(String timeStart) {
    this.timeStart = timeStart;
  }

  public String getTimeEnd() {
    return this.timeEnd;
  }

  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public List<ServiceRest> getServices() {
    return this.services;
  }

  public void setServices(List<ServiceRest> services) {
    this.services = services;
  }

  public CustomerRest getCustomer() {
    return this.customer;
  }

  public void setCustomer(CustomerRest customer) {
    this.customer = customer;
  }

  public RoomRest getRoom() {
    return this.room;
  }

  public void setRoom(RoomRest room) {
    this.room = room;
  }

}