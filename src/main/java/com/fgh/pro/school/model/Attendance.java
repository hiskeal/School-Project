package com.fgh.pro.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;



@Getter
@Setter
//@ToString
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "attendances")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long attendance_id;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "attendant")
    private String attendant;

    @Column(name = "status")
    private Boolean status;


    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

}
