package com.hotelmanagement.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hotelmanagement.api.dto.BookingRoomDto;
import com.hotelmanagement.api.entity.BookingRoomEntity;
import com.hotelmanagement.api.repository.BookingRoomRepository;
import com.hotelmanagement.api.service.BookingRoomService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingRoomServiceImpl implements BookingRoomService {
  @Autowired
  BookingRoomRepository bookingRoomRepository;

  @Override
  public BookingRoomDto createBookingRoom(BookingRoomDto bookingRoom) {
    BookingRoomEntity bookingRoomEntity = new BookingRoomEntity();
    BeanUtils.copyProperties(bookingRoom, bookingRoomEntity);
    bookingRoomEntity.setEmployeeId(123456789);
    bookingRoomEntity.setStatus("CHECKIN");

    BookingRoomEntity storedBookingRoomDetails = bookingRoomRepository.save(bookingRoomEntity);

    BookingRoomDto returnValue = new BookingRoomDto();
    BeanUtils.copyProperties(storedBookingRoomDetails, returnValue);

    return returnValue;
  }

  @Override
  public List<BookingRoomDto> getBookingRooms() {
    List<BookingRoomDto> bookingRooms = new ArrayList<BookingRoomDto>();
    List<BookingRoomEntity> bookingRoomEntities = bookingRoomRepository.findByStatus("CHECKIN");
    for (BookingRoomEntity bookingRoomEntity : bookingRoomEntities) {
      BookingRoomDto bookingRoom = new BookingRoomDto();
      BeanUtils.copyProperties(bookingRoomEntity, bookingRoom);
      bookingRooms.add(bookingRoom);
    }
    return bookingRooms;
  }

  @Override
  public BookingRoomDto checkOut(long roomId) {
    BookingRoomDto returnValue = new BookingRoomDto();
    BookingRoomEntity bookingRoomEntity = bookingRoomRepository.findByRoomIdAndStatus(roomId, "CHECKIN");
    bookingRoomEntity.setStatus("CHECKOUT");
    BookingRoomEntity updatedBookingRoomEntity = bookingRoomRepository.save(bookingRoomEntity);
    BeanUtils.copyProperties(updatedBookingRoomEntity, returnValue);

    return returnValue;
  }

}