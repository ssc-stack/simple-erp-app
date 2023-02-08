package com.example.erpapp.service;

import com.example.erpapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ERPService {

    private static final List<Student> students=new ArrayList<>();
    private static int rollno=0;

    static {
        Student s1=new Student(++rollno,"abc","male",
                List.of(80.0,90.0,87.0,60.0),"Delhi");
        students.add(s1);
        Student s2=new Student(++rollno,"xyz","male",
                List.of(60.0,66.0,87.7,61.6),"Haryana");

        students.add(s2);
        Student s3=new Student(++rollno,"Anshika","female",
                List.of(88.0,99.0,30.0,20.0),"Mumbai");
        students.add(s3);
        Student s4=new Student(++rollno,"sarah","female",
                List.of(60.0,62.1,87.9,61.0),"Chennai");
        students.add(s4);
        Student s5=new Student(++rollno,"san","male",
                List.of(79.64,99.0,55.0,45.0),"Rajasthan");

        students.add(s5);
    }

    public List<Student> findAll() {
        return students;
    }

    public Student findById(int rollno) {
        for(Student student:students) {
            if(student.getRollNumber()==rollno) return student;
        }

        return null;
    }
}
