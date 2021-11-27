package com.example.tp2.controller.api;

import com.example.tp2.dto.UserDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.tp2.services.utils.Constants.APP_ROOT;

public interface UserApi {

    @PostMapping(value = APP_ROOT+"/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    UserDto save(@RequestBody UserDto userdto);

    @GetMapping(value = APP_ROOT+"user/{idUser}", produces = MediaType.APPLICATION_JSON_VALUE)
    UserDto findById(@PathVariable("idUser") long idUser);

    @GetMapping(value = APP_ROOT+"users", produces = MediaType.APPLICATION_JSON_VALUE)
    List<UserDto> findAll();

    @DeleteMapping(value = APP_ROOT+"user/{idUser}")
    void delete(@PathVariable("idUser") long idUser);
}
