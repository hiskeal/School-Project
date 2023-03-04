package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherRequestDto {

    private String firstName;

    private String lastName;

    private int age;

    private Long departmentId;

    private Date dob;

    private String email;

    private String password;
    private Long phoneNumber;

    private String registeredDate;
    private Date createdOn;
    private Date updatedOn;
}
