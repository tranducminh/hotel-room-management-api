package com.hotelmanagement.api.service;

import com.hotelmanagement.api.dto.UserDto;

public interface UserService {
  UserDto createUser(UserDto user);
}