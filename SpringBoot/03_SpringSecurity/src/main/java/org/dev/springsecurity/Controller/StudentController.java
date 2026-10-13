package org.dev.springsecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.dev.springsecurity.Models.Student;
import org.dev.springsecurity.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentServices studentServices;

    @RequestMapping("/")
    public String Home(){
        return "Welcome ...";
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
       return studentServices.getStudents();
    }

    @GetMapping("/csrf")
    public Object getCsrf(HttpServletRequest request){
        return request.getAttribute("_csrf");
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return studentServices.addStudent(student);
    }
}
