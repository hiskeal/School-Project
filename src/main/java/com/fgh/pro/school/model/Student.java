package com.fgh.pro.school.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "age")
    private int age;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "registered_date")
    private String registeredDate;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "updated_on")
    private Date updatedOn;


}
