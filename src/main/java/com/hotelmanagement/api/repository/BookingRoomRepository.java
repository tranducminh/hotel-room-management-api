package com.hotelmanagement.api.repository;

import com.hotelmanagement.api.entity.BookingRoomEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRoomRepository extends CrudRepository<BookingRoomEntity, Long> {
  BookingRoomEntity findByRoomId(long roomId);
}