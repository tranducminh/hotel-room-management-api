package com.hotelmanagement.api.controller;

import com.hotelmanagement.api.dto.BookingRoomDto;
import com.hotelmanagement.api.model.request.BookingRoomDetailRequestModel;
import com.hotelmanagement.api.model.response.BookingRoomRest;
import com.hotelmanagement.api.service.BookingRoomService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("booking-rooms")
public class BookingRoomController {
  @Autowired
  BookingRoomService bookingRoomService;

  @PostMapping
  public BookingRoomRest createBookingRoom(@RequestBody BookingRoomDetailRequestModel bookingRoomDetails) {
    BookingRoomRest returnValue = new BookingRoomRest();

    BookingRoomDto bookingRoomDto = new BookingRoomDto();
    BeanUtils.copyProperties(bookingRoomDetails, bookingRoomDto);

    BookingRoomDto createBookingRoom = bookingRoomService.createBookingRoom(bookingRoomDto);
    BeanUtils.copyProperties(createBookingRoom, returnValue);

    return returnValue;
  }

}