package com.expenseTracker.springboot_app.controllers;

import com.expenseTracker.springboot_app.dto.CreateUserDTO;
import com.expenseTracker.springboot_app.dto.UserDTO;
import com.expenseTracker.springboot_app.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

public class UserController {

    private UserService userService;

    /* API to get All users */
    @GetMapping("/users")
    ResponseEntity<List<UserDTO>> getAllUser(){
        List<UserDTO> userDTOList = userService.getAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(userDTOList);
    }

    /* API to get user */
    @GetMapping("users/{id}")
    ResponseEntity<UserDTO> getUser(@PathVariable long id){
        UserDTO userDTO = userService.getUser(id);
        return ResponseEntity.status(HttpStatus.OK).body(userDTO);
    }

    /* API to create new user and add in database */
    @PostMapping("/users")
    ResponseEntity<CreateUserDTO> createNewUser(@RequestBody CreateUserDTO createUserDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createNewUser(createUserDTO));
    }

    /* API to delete Existing User */
    @DeleteMapping("/user/{id}")
    ResponseEntity<UserDTO> deleteUser(@PathVariable long id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    /* API to update Existing User */
    @PutMapping("/users/{id}")
    ResponseEntity<CreateUserDTO> updateExistingUser(@PathVariable long id, @RequestBody CreateUserDTO updateUserDTO){
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateExistingUser(id, updateUserDTO));
    }
}
