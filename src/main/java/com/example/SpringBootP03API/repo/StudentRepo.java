package com.example.SpringBootP03API.repo;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {
    public String getStudentData(){
        return "Hello Arjun";
    }
}
