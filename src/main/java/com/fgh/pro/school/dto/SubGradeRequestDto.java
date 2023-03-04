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
public class SubGradeRequestDto {


    private Long subjectId;

    private Long gradeId;

    private Date createdOn;

    private Instant updatedOn;
}
