package com.fgh.pro.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject_name")
    private String subjectName;
    @Column(name = "sub_abbreviation",nullable = false)
    private String subAbbreviation;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Instant updatedOn;

}
