package com.hotelmanagement.api.controller;

import com.hotelmanagement.api.dto.CustomerDto;
import com.hotelmanagement.api.model.request.CustomerDetailRequestModel;
import com.hotelmanagement.api.model.response.CustomerRest;
import com.hotelmanagement.api.service.CustomerService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {
  @Autowired
  CustomerService customerService;

  @PostMapping
  public CustomerRest createCustomer(@RequestBody CustomerDetailRequestModel customerDetails) {
    CustomerRest returnValue = new CustomerRest();

    CustomerDto customerDto = new CustomerDto();
    BeanUtils.copyProperties(customerDetails, customerDto);

    CustomerDto createCustomer = customerService.createCustomer(customerDto);
    BeanUtils.copyProperties(createCustomer, returnValue);

    return returnValue;
  }
}