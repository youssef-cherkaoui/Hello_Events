package com.example.hello_events.Service;

import com.example.hello_events.Model.Dto.BookingDTO;
import com.example.hello_events.Model.Dto.UserDTO;
import com.example.hello_events.Model.User;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO user);
    List<UserDTO> getAllUsers();
    void deleteUser(Long id);
}
