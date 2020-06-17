package com.hotelmanagement.api.service;

import java.util.List;

import com.hotelmanagement.api.dto.BookingRoomDto;

public interface BookingRoomService {
  BookingRoomDto createBookingRoom(BookingRoomDto bookingRoom);

  List<BookingRoomDto> getBookingRooms();

  BookingRoomDto checkOut(long roomId);
}