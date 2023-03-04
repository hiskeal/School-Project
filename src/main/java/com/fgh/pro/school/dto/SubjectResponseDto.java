package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectResponseDto {

    private Long id;
    private String subAbbreviation;


    private String subjectName;


    private Date createdOn;


    private Instant updatedOn;

}
