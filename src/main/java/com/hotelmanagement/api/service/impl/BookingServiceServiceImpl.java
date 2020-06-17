package com.hotelmanagement.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hotelmanagement.api.dto.BookingServiceDto;
import com.hotelmanagement.api.entity.BookingServiceEntity;
import com.hotelmanagement.api.repository.BookingServiceRepository;
import com.hotelmanagement.api.service.BookingServiceService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceServiceImpl implements BookingServiceService {
  @Autowired
  BookingServiceRepository bookingServiceRepository;

  @Override
  public BookingServiceDto createBookingService(BookingServiceDto bookingService) {
    BookingServiceEntity bookingServiceEntity = new BookingServiceEntity();
    BeanUtils.copyProperties(bookingService, bookingServiceEntity);
    bookingServiceEntity.setEmployeeId(123456789);
    bookingServiceEntity.setStatus("CHECKIN");

    BookingServiceEntity storedBookingServiceDetails = bookingServiceRepository.save(bookingServiceEntity);

    BookingServiceDto returnValue = new BookingServiceDto();
    BeanUtils.copyProperties(storedBookingServiceDetails, returnValue);

    return returnValue;
  }

  @Override
  public List<BookingServiceDto> getBookingServicesByRoomId(long roomId) {
    List<BookingServiceDto> returnValueList = new ArrayList<BookingServiceDto>();
    List<BookingServiceEntity> bookingServiceEntityList = bookingServiceRepository.findByRoomId(roomId);
    for (BookingServiceEntity bookingServiceEntity : bookingServiceEntityList) {
      BookingServiceDto bookingServiceDto = new BookingServiceDto();
      BeanUtils.copyProperties(bookingServiceEntity, bookingServiceDto);
      returnValueList.add(bookingServiceDto);
    }
    return returnValueList;
  }

}