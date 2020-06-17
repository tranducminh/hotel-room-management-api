package com.hotelmanagement.api.service;

import java.util.List;

import com.hotelmanagement.api.dto.BookingServiceDto;

public interface BookingServiceService {
  BookingServiceDto createBookingService(BookingServiceDto bookingService);

  List<BookingServiceDto> getBookingServicesByRoomId(long roomId);
}