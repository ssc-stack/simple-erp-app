package com.example.erpapp.controller;

import com.example.erpapp.model.Student;
import com.example.erpapp.service.ERPService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/erp-app")
public class ERPController {

    //CRUD
    //Topper
    //Least score
    // Percentage // new concept to be used

    @Autowired
    private ERPService erpService; // Dependency Injection

    @GetMapping("find-all-students")
    public List<Student> findAllStudents() {
        return erpService.findAll();
    }

    @GetMapping("find-student/rollno/{rollno}")
    public Student findStudentById(@PathVariable int rollno) {
        return erpService.findById(rollno);
    }
}
