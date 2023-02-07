package com.example.erpapp.service;

import com.example.erpapp.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ERPService {

    private final List<Student> students=new ArrayList<>();
    private static int rollno=0;

    static {
        Student s1=new Student(++rollno,"abc","male",
                List.of(80.0,90.0,87.0,60.0),"Delhi");
        Student s2=new Student(++rollno,"xyz","male",
                List.of(60.0,66.0,87.7,61.6),"Haryana");
        Student s3=new Student(++rollno,"Anshika","female",
                List.of(88.0,99.0,30.0,20.0),"Mumbai");
        Student s4=new Student(++rollno,"sarah","female",
                List.of(60.0,62.1,87.9,61.0),"Chennai");
        Student s5=new Student(++rollno,"san","male",
                List.of(79.64,99.0,55.0,45.0),"Rajasthan");
    }
}
