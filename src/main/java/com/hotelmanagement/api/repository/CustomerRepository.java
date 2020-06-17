package com.hotelmanagement.api.repository;

import com.hotelmanagement.api.entity.CustomerEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {
  CustomerEntity findById(long id);
}