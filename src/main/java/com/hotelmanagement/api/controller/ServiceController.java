package com.hotelmanagement.api.controller;

import com.hotelmanagement.api.dto.ServiceDto;
import com.hotelmanagement.api.model.request.ServiceDetailRequestModel;
import com.hotelmanagement.api.model.response.ServiceRest;
import com.hotelmanagement.api.service.ServiceService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("services")
public class ServiceController {
  @Autowired
  ServiceService serviceService;

  @PostMapping
  public ServiceRest createRoom(@RequestBody ServiceDetailRequestModel serviceDetails) {
    ServiceRest returnValue = new ServiceRest();

    ServiceDto serviceDto = new ServiceDto();
    BeanUtils.copyProperties(serviceDetails, serviceDto);

    ServiceDto createService = serviceService.createService(serviceDto);
    BeanUtils.copyProperties(createService, returnValue);

    return returnValue;
  }
}