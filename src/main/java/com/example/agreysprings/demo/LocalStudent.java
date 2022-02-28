package com.example.agreysprings.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pojos.Student;

@Component
@Data
public class LocalStudent {
    int rollno;
    String name;
    String std;
    @Autowired
    Student student;

    LocalStudent(){
        rollno = 0;
        name = "ABC";
        std = "NA";
        System.out.println("Object Created: LocalStudent");
    }

    public String toString(){
        return  new StringBuilder("Roll no. :").append(rollno).append("\nName : ").
                append(name).append("\nStandard: ").append(std).append(student.getRollno()).toString();
    }
}
