package com.hotelmanagement.api.repository;

import java.util.List;

import com.hotelmanagement.api.entity.BookingServiceEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingServiceRepository extends CrudRepository<BookingServiceEntity, Long> {
  List<BookingServiceEntity> findByRoomId(long roomId);
}