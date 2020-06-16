package com.hotelmanagement.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hotelmanagement.api.dto.RoomDto;
import com.hotelmanagement.api.entity.RoomEntity;
import com.hotelmanagement.api.repository.RoomRepository;
import com.hotelmanagement.api.service.RoomService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomImpl implements RoomService {
  @Autowired
  RoomRepository roomRepository;

  @Override
  public RoomDto createRoom(RoomDto room) {
    RoomEntity roomEntity = new RoomEntity();
    BeanUtils.copyProperties(room, roomEntity);
    roomEntity.setRoomStatus("READY");

    RoomEntity storedRoomDetails = roomRepository.save(roomEntity);

    RoomDto returnValue = new RoomDto();
    BeanUtils.copyProperties(storedRoomDetails, returnValue);

    return returnValue;
  }

  @Override
  public RoomDto getRoomById(long id) {
    RoomDto returnValue = new RoomDto();
    RoomEntity roomEntity = roomRepository.findById(id);
    BeanUtils.copyProperties(roomEntity, returnValue);
    return returnValue;

  }

  @Override
  public List<RoomDto> getRoomByStatus(String roomStatus) {
    List<RoomDto> returnValueList = new ArrayList<RoomDto>();
    List<RoomEntity> roomEntityList = roomRepository.findByRoomStatus(roomStatus);
    for (RoomEntity roomEntity : roomEntityList) {
      RoomDto returnValue = new RoomDto();
      BeanUtils.copyProperties(roomEntity, returnValue);
      returnValueList.add(returnValue);
    }
    return returnValueList;
  }

}