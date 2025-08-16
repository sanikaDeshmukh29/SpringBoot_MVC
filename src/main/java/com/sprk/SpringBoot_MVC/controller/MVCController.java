package com.sprk.SpringBoot_MVC.controller;

import com.sprk.SpringBoot_MVC.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


    @GetMapping("/students")
    public String showStudents(Model model){
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setRollNo(10);
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setEmail("john@gmail.com");
        student.setPhone("+91 12345 12345");
        student.setGender("Male");
        student.setPrime(true);
        student.setSkills(Arrays.asList("java","python"));

        students.add(student);

        Student student2 = new Student();
        student2.setRollNo(1);
        student2.setFirstName("Shubham");
        student2.setLastName("Palande");
        student2.setEmail("shubh12@gmail.com");
        student2.setPhone("+91 88888 12345");
        student2.setGender("Male");
        student2.setPrime(false);
        student2.setSkills(Arrays.asList("c++","python"));

        students.add(student2);

        Student student3 = new Student();
        student3.setRollNo(5);
        student3.setFirstName("Pranjali");
        student3.setLastName("Sharma");
        student3.setEmail("prsharma@gmail.com");
        student3.setPhone("+91 11111 99999");
        student3.setGender("Female");
        student3.setPrime(true);
        student3.setSkills(Arrays.asList("java","c"));
        students.add(student3);

        Student student4 = new Student();
        student4.setRollNo(3);
        student4.setFirstName("Ayushi");
        student4.setLastName("Shinde");
        student4.setEmail("ayushi@gmail.com");
        student4.setPhone("+91 12345 99999");
        student4.setGender("Female");
        student4.setPrime(false);
        student4.setSkills(Arrays.asList("java","react"));
        students.add(student4);
        students.sort((s1,s2)->Integer.compare(s1.getRollNo(), s2.getRollNo()));
        model.addAttribute("students", students);

        return "student-list";
    }
}
