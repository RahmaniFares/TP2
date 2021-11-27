package com.example.tp2.services;

import com.example.tp2.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto save(UserDto userdto);

    UserDto findById(long id);

    List<UserDto> findAll();

    void delete(long id);
}
