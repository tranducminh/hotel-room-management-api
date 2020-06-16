package com.hotelmanagement.api.service.impl;

import com.hotelmanagement.api.dto.ServiceDto;
import com.hotelmanagement.api.entity.ServiceEntity;
import com.hotelmanagement.api.repository.ServiceRepository;
import com.hotelmanagement.api.service.ServiceService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceServiceImpl implements ServiceService {
  @Autowired
  ServiceRepository serviceRepository;

  @Override
  public ServiceDto createService(ServiceDto service) {
    ServiceEntity serviceEntity = new ServiceEntity();
    BeanUtils.copyProperties(service, serviceEntity);

    ServiceEntity storedRoomDetails = serviceRepository.save(serviceEntity);

    ServiceDto returnValue = new ServiceDto();
    BeanUtils.copyProperties(storedRoomDetails, returnValue);

    return returnValue;
  }
}