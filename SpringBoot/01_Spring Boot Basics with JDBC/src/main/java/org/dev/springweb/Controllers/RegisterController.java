package org.dev.springweb.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @GetMapping("/")
    public String registerUser(){
        return "Sign UP to continue...";
    }
}
