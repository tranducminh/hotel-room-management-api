package com.hotelmanagement.api.repository;

import java.util.List;

import com.hotelmanagement.api.entity.RoomEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
  RoomEntity findById(long id);

  RoomEntity findByRoomNumber(long roomNumber);

  List<RoomEntity> findByRoomStatus(String roomStatus);

}