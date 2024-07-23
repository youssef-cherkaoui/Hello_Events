package com.example.hello_events.Service;

import com.example.hello_events.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void deleteUser(Long id);
}
