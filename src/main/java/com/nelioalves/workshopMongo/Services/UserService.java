package com.nelioalves.workshopMongo.Services;

import com.nelioalves.workshopMongo.Domain.User;
import com.nelioalves.workshopMongo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
