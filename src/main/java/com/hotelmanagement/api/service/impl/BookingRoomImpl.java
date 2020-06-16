package com.hotelmanagement.api.service.impl;

import com.hotelmanagement.api.dto.BookingRoomDto;
import com.hotelmanagement.api.entity.BookingRoomEntity;
import com.hotelmanagement.api.repository.BookingRoomRepository;
import com.hotelmanagement.api.service.BookingRoomService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingRoomImpl implements BookingRoomService {
  @Autowired
  BookingRoomRepository bookingRoomRepository;

  @Override
  public BookingRoomDto createBookingRoom(BookingRoomDto bookingRoom) {
    BookingRoomEntity bookingRoomEntity = new BookingRoomEntity();
    BeanUtils.copyProperties(bookingRoom, bookingRoomEntity);

    BookingRoomEntity storedBookingRoomDetails = bookingRoomRepository.save(bookingRoomEntity);

    BookingRoomDto returnValue = new BookingRoomDto();
    BeanUtils.copyProperties(storedBookingRoomDetails, returnValue);

    return returnValue;
  }

}