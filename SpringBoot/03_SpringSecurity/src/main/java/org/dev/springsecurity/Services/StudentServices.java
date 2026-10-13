package org.dev.springsecurity.Services;

import org.dev.springsecurity.Models.Student;
import org.dev.springsecurity.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    StudentRepository repo;


    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Student addStudent(Student student) {
        repo.save(student);
        return student;
    }
}
