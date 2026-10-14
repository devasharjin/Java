package org.dev.springsecurity.Controller;

import org.dev.springsecurity.Models.Users;
import org.dev.springsecurity.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public Users createUsers(@RequestBody Users user){
        return userService.addUser(user);
    }
}
