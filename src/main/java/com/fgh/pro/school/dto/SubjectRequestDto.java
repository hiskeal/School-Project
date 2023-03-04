package com.fgh.pro.school.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubjectRequestDto {


    private String subjectName;

    private String subAbbreviation;


    private Date createdOn;


    private Instant updatedOn;
}
