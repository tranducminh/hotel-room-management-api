package com.hotelmanagement.api.controller;

import com.hotelmanagement.api.dto.UserDto;
import com.hotelmanagement.api.model.request.UserDetailRequestModel;
import com.hotelmanagement.api.model.response.UserRest;
import com.hotelmanagement.api.service.UserService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "localhost:3000")
@RestController
@RequestMapping("users") // localhost:8080/users
public class UserController {
  @Autowired
  UserService userService;

  @GetMapping
  public String getUser() {
    return "get user";
  }

  @PostMapping
  public UserRest createUser(@RequestBody UserDetailRequestModel userDetails) {
    UserRest returnValue = new UserRest();

    UserDto userDto = new UserDto();
    BeanUtils.copyProperties(userDetails, userDto);

    UserDto createUser = userService.createUser(userDto);
    BeanUtils.copyProperties(createUser, returnValue);

    return returnValue;
  }
}