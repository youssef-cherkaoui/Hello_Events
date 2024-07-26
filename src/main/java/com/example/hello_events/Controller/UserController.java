package com.example.hello_events.Controller;


import com.example.hello_events.Model.Dto.UserDTO;
import com.example.hello_events.Model.User;
import com.example.hello_events.Service.UserService;
import com.example.hello_events.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping("/AllUsers")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }
}
