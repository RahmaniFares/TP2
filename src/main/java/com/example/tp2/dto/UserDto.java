package com.example.tp2.dto;


import com.example.tp2.model.User;


public class UserDto {

    private long id;

    private String name;

    private String adresse;

    private String age;

    public static UserDto fromEntity(User user)
    {
        if (user == null){
            return null;
        }

        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setAge(user.getAge());
        dto.setAdresse(user.getAdresse());
        return dto;
    }

    public static User toEntity(UserDto userDto)
    {
        if (userDto == null){
            return null;
        }

        User u = new User();
        u.setId(userDto.getId());
        u.setName(userDto.getName());
        u.setAge(userDto.getAge());
        u.setAdresse(userDto.getAdresse());
        return u;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
