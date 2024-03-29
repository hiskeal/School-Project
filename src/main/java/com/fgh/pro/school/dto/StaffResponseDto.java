package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffResponseDto {

    private Long id;
    private String address;

    private String name;

    private  String lastName;

    private String motherLastName;

    private String fatherLastName;

    private  String gender;

    private int dob;

    private Date yearOfService;

    private Date dateOfHiring;

   private String formation;

    private double salaryFormation;

    private Long phoneNumber;

    private String motherContact;

    private String fatherContact;

    private Date createdOn;

    private Date updatedOn;

}
