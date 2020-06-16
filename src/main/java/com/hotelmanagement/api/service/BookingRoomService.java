package com.hotelmanagement.api.service;

import com.hotelmanagement.api.dto.BookingRoomDto;

public interface BookingRoomService {
  BookingRoomDto createBookingRoom(BookingRoomDto bookingRoom);
}