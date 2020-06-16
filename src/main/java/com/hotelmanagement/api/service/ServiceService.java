package com.hotelmanagement.api.service;

import com.hotelmanagement.api.dto.ServiceDto;

public interface ServiceService {
  ServiceDto createService(ServiceDto service);
}