package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffRequestDto {

    private String address;

    private String name;

    private  String lastName;

    private String motherLastName;

    private String fatherLastName;

    private  String gender;

    private int dob;

    private Date dateOfHiring;

    private String formation;

    private Long staffTypeId;

    private double salaryFormation;

    private Date yearOfService;

    private Long phoneNumber;

    private String motherContact;

    private String fatherContact;

    private Date createdOn;

    private Date updatedOn;
}
