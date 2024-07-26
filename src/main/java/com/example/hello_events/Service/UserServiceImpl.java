package com.example.hello_events.Service;

import com.example.hello_events.Model.Dto.EventDTO;
import com.example.hello_events.Model.Dto.UserDTO;
import com.example.hello_events.Model.User;
import com.example.hello_events.Model.mapper.UserMapper;
import com.example.hello_events.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository ;
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO createUser(UserDTO user) {
        System.out.println(user);
        return userMapper.toDTO(userRepository.save(userMapper.toEntity(user))) ;
    }

    @Override
    public List<UserDTO> getAllUsers(){
        return userMapper.toDTOList(userRepository.findAll());
    }

    @Override
    public void  deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
