package com.hotelmanagement.api.controller;

import com.hotelmanagement.api.service.BookingRoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "booking-rooms")
public class BookingRoomController {
  @Autowired
  BookingRoomService bookingRoomService;

}