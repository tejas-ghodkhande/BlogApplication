package com.tejas.BlogApplication.service;

import com.tejas.BlogApplication.exception.ResourceNotFoundException;
import com.tejas.BlogApplication.dto.UserDto;
import com.tejas.BlogApplication.entity.User;
import com.tejas.BlogApplication.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDto createUser(UserDto userDto) {
        User user=this.dtoToUser(userDto);
        User savedUser=this.userRepo.save(user);
        return this.userToDto(savedUser);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Integer userId) {

        User user = this.userRepo.findById(userId).orElseThrow(e->new ResourceNotFoundException("User","id","userId"));
        return user;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }


    private User dtoToUser(UserDto userDto){

     User user = new User();
     user.setId(userDto.getId());
     user.setName(userDto.getName());
     user.setEmail(userDto.getEmail());
     user.setAbout(userDto.getAbout());
     user.setPassword(userDto.getPassword());
     return user;
    }

    private UserDto userToDto(User user){

      UserDto userDto = new UserDto();
      userDto.setId(user.getId());
      userDto.setName(user.getName());
      userDto.setEmail(user.getEmail());
      userDto.setAbout(user.getAbout());
      userDto.setPassword(user.getPassword());
      return userDto;
    }
}
