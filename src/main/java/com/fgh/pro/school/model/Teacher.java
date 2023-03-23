package com.fgh.pro.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "age")
    private int age;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "department_id",nullable = false)
    private Department department;

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
