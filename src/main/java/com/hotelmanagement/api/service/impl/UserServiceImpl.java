package com.hotelmanagement.api.service.impl;

import com.hotelmanagement.api.dto.UserDto;
import com.hotelmanagement.api.entity.UserEntity;
import com.hotelmanagement.api.repository.UserRepository;
import com.hotelmanagement.api.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  UserRepository userRepository;

  @Override
  public UserDto createUser(UserDto user) {
    UserEntity userEntity = new UserEntity();
    BeanUtils.copyProperties(user, userEntity);

    userEntity.setEncryptedPassword("test");
    userEntity.setEmailVerificationToken("testToken");
    userEntity.setUserId("userId");

    UserEntity storedUserDetails = userRepository.save(userEntity);

    UserDto returnValue = new UserDto();
    BeanUtils.copyProperties(storedUserDetails, returnValue);

    return returnValue;
  }

}