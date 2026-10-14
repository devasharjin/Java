package org.dev.springsecurity.Services;

import org.dev.springsecurity.Models.Users;
import org.dev.springsecurity.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);
    
    @Autowired
    UsersRepository repo;

    public  Users addUser(Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
         repo.save(user);
         return user;
    }
}
