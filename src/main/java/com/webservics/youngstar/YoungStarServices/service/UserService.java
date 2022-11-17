package com.webservics.youngstar.YoungStarServices.service;

import com.webservics.youngstar.YoungStarServices.dto.UserDto;
import com.webservics.youngstar.YoungStarServices.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}