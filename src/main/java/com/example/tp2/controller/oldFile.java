/*
package com.example.tp2.controller;


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
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public ResponseEntity<User> save(@RequestBody User user){
        try {
            return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        try {
            List<User> list = userRepository.findAll();

            if (list.isEmpty() || list.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) {
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/update-user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value ="id") long Id, @RequestBody User user) {

        User us = userRepository.findById(Id);
        us.setName(user.getName());
        us.setAdresse(user.getAdresse());
        us.setAge(user.getAge());


        try {
            return new ResponseEntity<>(userRepository.save(us), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/users")
    public ResponseEntity<User> updateCustomer(@RequestBody User customer) {
        try {
            return new ResponseEntity<>(userRepository.save(customer), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long id) {
        try {
            Optional<User> customer = userRepository.findById(id);
            if (customer.isPresent()) {
                userRepository.delete(customer.get());
            }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users2")
    public ResponseEntity<List<User>> getAllUser2(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "1") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy)
    {

        PageRequest paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<User> pagedResult = userRepository.findAll(paging);

        List<User> list;

        if(pagedResult.hasContent()) {
            list= pagedResult.getContent();
        } else {
            list = new ArrayList<User>();
        }
        return new ResponseEntity<List<User>>(list, new HttpHeaders(), HttpStatus.OK);

    }

}

 */