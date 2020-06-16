package com.hotelmanagement.api.repository;

import java.util.List;

import com.hotelmanagement.api.entity.ServiceEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<ServiceEntity, Long> {
  List<ServiceEntity> findAll();
}