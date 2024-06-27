package com.nelioalves.workshopMongo.Services;

import com.nelioalves.workshopMongo.Domain.User;
import com.nelioalves.workshopMongo.Repository.UserRepository;
import com.nelioalves.workshopMongo.Services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
