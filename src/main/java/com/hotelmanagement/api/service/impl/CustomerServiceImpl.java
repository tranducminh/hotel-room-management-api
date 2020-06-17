package com.hotelmanagement.api.service.impl;

import com.hotelmanagement.api.dto.CustomerDto;
import com.hotelmanagement.api.entity.CustomerEntity;
import com.hotelmanagement.api.repository.CustomerRepository;
import com.hotelmanagement.api.service.CustomerService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
  @Autowired
  CustomerRepository customerRepository;

  @Override
  public CustomerDto createCustomer(CustomerDto customer) {
    CustomerEntity customerEntity = new CustomerEntity();
    BeanUtils.copyProperties(customer, customerEntity);

    CustomerEntity storedRoomDetails = customerRepository.save(customerEntity);

    CustomerDto returnValue = new CustomerDto();
    BeanUtils.copyProperties(storedRoomDetails, returnValue);

    return returnValue;
  }

  @Override
  public CustomerDto getCustomerById(long id) {
    CustomerDto returnValue = new CustomerDto();
    CustomerEntity customerEntity = customerRepository.findById(id);
    BeanUtils.copyProperties(customerEntity, returnValue);
    return returnValue;
  }

}