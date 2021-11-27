package com.example.tp2.controller;


import com.example.tp2.controller.api.UserApi;
import com.example.tp2.dto.UserDto;
import com.example.tp2.model.User;
import com.example.tp2.repository.UserRepository;
import com.example.tp2.services.UserService;
import com.example.tp2.services.impl.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class UserController implements UserApi {


    private UserService userService;
    public UserController(UserService userService) {
        this.userService=userService;
    }

    @Override
    public UserDto save(UserDto userdto) {
        return userService.save(userdto);
    }

    @Override
    public UserDto findById(long idUser) {
        return userService.findById(idUser);
    }

    @Override
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @Override
    public void delete(long idUser) {
        userService.delete(idUser);

    }
}
