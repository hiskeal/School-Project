package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreRecordRequestDto {

    private float firstSemester;

    private float secondSemester;

    private float thirdSemester;

    private float finalGrade;

    private Date year;


    private Long studentId;

    private Long subjectId;

    private Date createdOn;

    private Instant updatedOn;
}
