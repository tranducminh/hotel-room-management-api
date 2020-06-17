package com.hotelmanagement.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.hotelmanagement.api.dto.BookingRoomDto;
import com.hotelmanagement.api.dto.BookingServiceDto;
import com.hotelmanagement.api.dto.CustomerDto;
import com.hotelmanagement.api.dto.RoomDto;
import com.hotelmanagement.api.dto.ServiceDto;
import com.hotelmanagement.api.model.request.BookingRoomDetailRequestModel;
import com.hotelmanagement.api.model.response.BookingRoomRest;
import com.hotelmanagement.api.model.response.CustomerRest;
import com.hotelmanagement.api.model.response.InUseRoomRest;
import com.hotelmanagement.api.model.response.RoomRest;
import com.hotelmanagement.api.model.response.ServiceRest;
import com.hotelmanagement.api.service.BookingRoomService;
import com.hotelmanagement.api.service.BookingServiceService;
import com.hotelmanagement.api.service.CustomerService;
import com.hotelmanagement.api.service.RoomService;
import com.hotelmanagement.api.service.ServiceService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("booking-rooms")
public class BookingRoomController {
  @Autowired
  BookingRoomService bookingRoomService;

  @Autowired
  BookingServiceService bookingServiceService;

  @Autowired
  ServiceService serviceService;

  @Autowired
  CustomerService customerService;

  @Autowired
  RoomService roomService;

  @PostMapping
  public BookingRoomRest createBookingRoom(@RequestBody BookingRoomDetailRequestModel bookingRoomDetails) {
    BookingRoomRest returnValue = new BookingRoomRest();

    BookingRoomDto bookingRoomDto = new BookingRoomDto();
    BeanUtils.copyProperties(bookingRoomDetails, bookingRoomDto);

    BookingRoomDto createBookingRoom = bookingRoomService.createBookingRoom(bookingRoomDto);
    BeanUtils.copyProperties(createBookingRoom, returnValue);

    return returnValue;
  }

  @GetMapping
  public List<InUseRoomRest> getBookingRooms() {
    List<InUseRoomRest> returnValueList = new ArrayList<InUseRoomRest>();
    List<BookingRoomDto> bookingRoomDtoList = bookingRoomService.getBookingRooms();
    for (BookingRoomDto bookingRoomDto : bookingRoomDtoList) {
      InUseRoomRest returnValue = new InUseRoomRest();
      BeanUtils.copyProperties(bookingRoomDto, returnValue);

      List<ServiceRest> services = new ArrayList<ServiceRest>();
      List<BookingServiceDto> bookingServiceDtoList = bookingServiceService
          .getBookingServicesByRoomId(bookingRoomDto.getRoomId());
      for (BookingServiceDto bookingServiceDto : bookingServiceDtoList) {
        ServiceDto serviceDto = serviceService.getServiceById(bookingServiceDto.getServiceId());
        ServiceRest serviceRest = new ServiceRest();
        BeanUtils.copyProperties(serviceDto, serviceRest);
        services.add(serviceRest);
      }
      returnValue.setServices(services);

      CustomerDto customerDto = customerService.getCustomerById(bookingRoomDto.getCustomerId());
      CustomerRest customer = new CustomerRest();
      BeanUtils.copyProperties(customerDto, customer);
      returnValue.setCustomer(customer);

      RoomDto roomDto = roomService.getRoomById(bookingRoomDto.getRoomId());
      RoomRest room = new RoomRest();
      BeanUtils.copyProperties(roomDto, room);
      returnValue.setRoom(room);

      returnValueList.add(returnValue);

    }
    return returnValueList;
  }

  @PostMapping(path = "checkout/{roomId}")
  public String checkOut(@PathVariable long roomId) {
    BookingRoomDto bookingRoomDto = bookingRoomService.checkOut(roomId);
    roomService.updateRoomStatus(roomId, "READY");
    return bookingRoomDto.getStatus();
  }

}