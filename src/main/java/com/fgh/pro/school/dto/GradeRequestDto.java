package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GradeRequestDto {

    private String name;
    private String description;
    private Date createdOn;
    private Date updatedOn;
}
