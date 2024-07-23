package com.example.hello_events.Service;

import com.example.hello_events.Model.User;
import com.example.hello_events.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository ;

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public void  deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
