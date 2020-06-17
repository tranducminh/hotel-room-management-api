package com.hotelmanagement.api.repository;

import java.util.List;

import com.hotelmanagement.api.entity.BookingRoomEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRoomRepository extends CrudRepository<BookingRoomEntity, Long> {
  BookingRoomEntity findByRoomId(long roomId);

  BookingRoomEntity findById(long id);

  BookingRoomEntity findByRoomIdAndStatus(long roomId, String roomStatus);

  List<BookingRoomEntity> findByStatus(String status);
}