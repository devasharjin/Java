package org.dev.springsecurity.Services;

import org.dev.springsecurity.Models.Users;
import org.dev.springsecurity.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    @Autowired
    AuthenticationManager authManager;
    @Autowired
    UsersRepository repo;

    @Autowired
    JwtService jwtService;

    public  Users addUser(Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
         repo.save(user);
         return user;
    }

    public String loginUser(Users user) {
        Authentication authentication =
                authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
        if(authentication.isAuthenticated())
            return jwtService.getToken(user.getUsername());

        return "failed";

    }
}
