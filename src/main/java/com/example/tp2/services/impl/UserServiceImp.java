package com.example.tp2.services.impl;

import com.example.tp2.dto.UserDto;
import com.example.tp2.model.User;
import com.example.tp2.repository.UserRepository;
import com.example.tp2.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto save(UserDto userdto) {

        // TODO Validation

        return UserDto.fromEntity(
                userRepository.save(
                        UserDto.toEntity(userdto)
                )
        );
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream().map(UserDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(long id) {
userRepository.deleteById(id);
    }

    @Override
    public UserDto findById(long id) {

        User user = userRepository.findById(id);

        UserDto userDto = UserDto.fromEntity(user.get());
        return userDto;
    }
}
