package com.example.agreysprings.demo;

import org.springframework.stereotype.Component;

@Component
public class LocalStudent {
    int rollno;
    String name;
    String std;

    LocalStudent(){
        rollno = 0;
        name = "ABC";
        std = "NA";
        System.out.println("Object Created");
    }

    public String toString(){
        return  new StringBuilder("Roll no. :").append(rollno).append("\nName : ").
                append(name).append("\n Standard").append(std).toString();
    }
}
