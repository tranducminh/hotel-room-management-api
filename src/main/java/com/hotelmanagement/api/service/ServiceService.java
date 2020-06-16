package com.hotelmanagement.api.service;

import java.util.List;

import com.hotelmanagement.api.dto.ServiceDto;

public interface ServiceService {
  ServiceDto createService(ServiceDto service);

  List<ServiceDto> getAllServices();
}