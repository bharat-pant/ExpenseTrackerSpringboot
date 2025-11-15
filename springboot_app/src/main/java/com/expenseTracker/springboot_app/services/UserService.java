package com.expenseTracker.springboot_app.services;

import com.expenseTracker.springboot_app.dto.CreateUserDTO;
import com.expenseTracker.springboot_app.dto.UserDTO;
import com.expenseTracker.springboot_app.entities.User;
import com.expenseTracker.springboot_app.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class UserService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    /* API to get All users */
    public List<UserDTO> getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for(User user: userList) {
            UserDTO userDTO = modelMapper.map(user, UserDTO.class);
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    /* API to get user */
    public UserDTO getUser(long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User Not Found"));
        return modelMapper.map(user, UserDTO.class);
    }

    /* API to create new user and add in database */
    public CreateUserDTO createNewUser(CreateUserDTO createUserDTO) {
        User user = modelMapper.map(createUserDTO, User.class);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, CreateUserDTO.class);
    }

    /* API to delete Existing User */
    public void deleteUser(long id) {
        if(!userRepository.existsById(id)){
            throw new IllegalArgumentException("Unable to delete as ID does not exist");
        }
        else userRepository.deleteById(id);
    }

    /* API to update Existing User */
    public CreateUserDTO updateExistingUser(long id, CreateUserDTO updateUserDTO) {
        User user = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Unable to update User data as user does not exist"));
        modelMapper.map(updateUserDTO, user);
        user = userRepository.save(user);
        return modelMapper.map(user, CreateUserDTO.class);
    }
}
