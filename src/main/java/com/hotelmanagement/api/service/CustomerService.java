package com.hotelmanagement.api.service;

import com.hotelmanagement.api.dto.CustomerDto;

public interface CustomerService {
  CustomerDto createCustomer(CustomerDto customer);
}