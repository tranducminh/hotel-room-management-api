package com.hotelmanagement.api.service.impl;

import java.util.ArrayList;
import java.util.List;

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

  @Override
  public List<ServiceDto> getAllServices() {
    List<ServiceDto> serviceDtoList = new ArrayList<ServiceDto>();
    List<ServiceEntity> serviceEntityList = serviceRepository.findAll();
    for (ServiceEntity serviceEntity : serviceEntityList) {
      ServiceDto serviceDto = new ServiceDto();
      BeanUtils.copyProperties(serviceEntity, serviceDto);
      serviceDtoList.add(serviceDto);
    }

    return serviceDtoList;
  }

  @Override
  public ServiceDto getServiceById(long id) {
    ServiceDto returnValue = new ServiceDto();
    ServiceEntity serviceEntity = serviceRepository.findById(id);
    BeanUtils.copyProperties(serviceEntity, returnValue);
    return returnValue;
  }
}