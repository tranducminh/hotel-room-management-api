package com.hotelmanagement.api.controller;

import com.hotelmanagement.api.dto.BookingServiceDto;
import com.hotelmanagement.api.model.request.BookingServiceDetailRequestModel;
import com.hotelmanagement.api.model.response.BookingServiceRest;
import com.hotelmanagement.api.service.BookingServiceService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("booking-services")
public class BookingServiceController {
  @Autowired
  BookingServiceService bookingServiceService;

  @PostMapping
  public BookingServiceRest createBookingService(@RequestBody BookingServiceDetailRequestModel bookingServiceDetails) {
    BookingServiceRest returnValue = new BookingServiceRest();

    BookingServiceDto bookingServiceDto = new BookingServiceDto();
    BeanUtils.copyProperties(bookingServiceDetails, bookingServiceDto);

    BookingServiceDto createBookingService = bookingServiceService.createBookingService(bookingServiceDto);
    BeanUtils.copyProperties(createBookingService, returnValue);

    return returnValue;
  }
}