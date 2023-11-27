package com.example.onetoonechat.service;


import com.example.onetoonechat.entity.Status;
import com.example.onetoonechat.entity.Users;
import com.example.onetoonechat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public void saveUser(Users user){
        user.setStatus(Status.ONLINE);
        userRepository.save(user);
    }

    public void disconnect(Users user){
        var storedUser = userRepository.findById(user.getNickName()).orElse(null);
        if (storedUser != null){
            storedUser.setStatus(Status.OFFLINE);
            userRepository.save(storedUser);
        }
    }

    public List<Users> findConnectedUsers(){
        return userRepository.findAllByStatus(Status.ONLINE);
    }
}
