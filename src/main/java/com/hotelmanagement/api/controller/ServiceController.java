package com.hotelmanagement.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.hotelmanagement.api.dto.ServiceDto;
import com.hotelmanagement.api.model.request.ServiceDetailRequestModel;
import com.hotelmanagement.api.model.response.ServiceRest;
import com.hotelmanagement.api.service.ServiceService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("services")
public class ServiceController {
  @Autowired
  ServiceService serviceService;

  @GetMapping
  public List<ServiceRest> getAllServices() {
    List<ServiceRest> returnValueList = new ArrayList<ServiceRest>();
    List<ServiceDto> serviceDtoList = serviceService.getAllServices();
    for (ServiceDto serviceDto : serviceDtoList) {
      ServiceRest serviceRest = new ServiceRest();
      BeanUtils.copyProperties(serviceDto, serviceRest);
      returnValueList.add(serviceRest);
    }

    return returnValueList;
  }

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