package com.fgh.pro.school.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "staffs")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private  String lastName;

    @Column(name = "mother_last_name")
    private String motherLastName;

    @Column(name = "father_last_name")
    private String fatherLastName;

    @Column(name = "gender")
    private  String gender;

    @Column(name = "dob")
    private int dob;

    @Column(name = "date_of_hiring")
    private Date dateOfHiring;

    @Column(name = "year_of_service")
    private Date yearOfService;

//    @Column(name = "formation")
//    private String formation;

    @Column(name = "salary")
    private double salaryFormation;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "mother_contact")
    private String motherContact;

    @Column(name = "father_contact")
    private String fatherContact;

    @ManyToOne
    @JoinColumn(name = "staff_type_id")
    private StaffType staffType;

}
