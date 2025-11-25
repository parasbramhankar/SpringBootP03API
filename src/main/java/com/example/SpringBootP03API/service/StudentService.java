package com.example.SpringBootP03API.service;

import com.example.SpringBootP03API.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public String getData(){
        return studentRepo.getStudentData();
    }
}
