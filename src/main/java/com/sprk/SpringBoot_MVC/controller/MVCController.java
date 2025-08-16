package com.sprk.SpringBoot_MVC.controller;

import com.sprk.SpringBoot_MVC.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {

    @GetMapping("/demo")
    public String showDemo(){
        return "demo";
    }

    @GetMapping("/show-student")
    public String showStudent(Model model){

        Student student = new Student();

        student.setRollNo(10);
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setEmail("john@gmail.com");
        student.setPhone("+91 12345 12345");
        student.setGender("Male");
        student.setPrime(true);


        model.addAttribute("student",student);
        return "student-information";
    }
}
