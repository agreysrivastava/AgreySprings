package com.example.agreysprings.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pojos.Student;


@SpringBootApplication(scanBasePackages = {"pojos","com.example.agreysprings.demo"})
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println("Bean Initialised");
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
        LocalStudent lcstudent =context.getBean(LocalStudent.class);
        System.out.println(lcstudent.toString());

    }

}
