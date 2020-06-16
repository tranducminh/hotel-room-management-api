package com.hotelmanagement.api.service;

import java.util.List;

import com.hotelmanagement.api.dto.RoomDto;

public interface RoomService {
  RoomDto createRoom(RoomDto room);

  RoomDto getRoomById(long id);

  List<RoomDto> getRoomByStatus(String roomStatus);
}