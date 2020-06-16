package com.hotelmanagement.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.hotelmanagement.api.dto.RoomDto;
import com.hotelmanagement.api.model.request.RoomDetailRequestModel;
import com.hotelmanagement.api.model.response.RoomRest;
import com.hotelmanagement.api.service.RoomService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "localhost:3000")
@RestController
@RequestMapping("rooms")
public class RoomController {
  @Autowired
  RoomService roomService;

  @GetMapping(path = "/{id}")
  public RoomRest getRoomById(@PathVariable long id) {
    RoomRest returnValue = new RoomRest();
    RoomDto roomDto = roomService.getRoomById(id);
    BeanUtils.copyProperties(roomDto, returnValue);
    return returnValue;
  }

  @GetMapping(path = "/status/{status}")
  public List<RoomRest> getRoomsByStatus(@PathVariable String status) {
    List<RoomRest> returnValueList = new ArrayList<RoomRest>();
    List<RoomDto> roomDtoList = roomService.getRoomByStatus(status);
    for (RoomDto roomDto : roomDtoList) {
      RoomRest roomRest = new RoomRest();
      BeanUtils.copyProperties(roomDto, roomRest);
      returnValueList.add(roomRest);
    }
    return returnValueList;
  }

  @PostMapping
  public RoomRest createRoom(@RequestBody RoomDetailRequestModel roomDetails) {
    RoomRest returnValue = new RoomRest();

    RoomDto roomDto = new RoomDto();
    BeanUtils.copyProperties(roomDetails, roomDto);

    RoomDto createRoom = roomService.createRoom(roomDto);
    BeanUtils.copyProperties(createRoom, returnValue);

    return returnValue;
  }

  @PutMapping(path = "/{id}/{status}")
  public RoomRest updateRoomStatus(@PathVariable long id, @PathVariable String status) {
    RoomRest returnValue = new RoomRest();
    RoomDto roomDto = roomService.updateRoomStatus(id, status);
    BeanUtils.copyProperties(roomDto, returnValue);
    return returnValue;
  }
}