package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentResponseDto {

    private Long id;
    private String departmentName;


    private String departmentLocation;


    private String departmentCode;


    private Date createdOn;

    private Date updatedOn;

}
