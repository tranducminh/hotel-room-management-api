package com.hotelmanagement.api.repository;

import com.hotelmanagement.api.entity.BookingServiceEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingServiceRepository extends CrudRepository<BookingServiceEntity, Long> {
  BookingServiceEntity findByRoomId(long roomId);
}