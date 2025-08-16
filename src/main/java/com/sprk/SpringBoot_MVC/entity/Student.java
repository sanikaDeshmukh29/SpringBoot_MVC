package com.sprk.SpringBoot_MVC.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Student {

    private int rollNo;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String gender;

    private boolean prime;

    List<String> skills = new ArrayList<>();
}
