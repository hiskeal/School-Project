package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceRequestDto {


    private Date date;

    private Date createdOn;

    private Date updatedOn;

    private Long studentId;

    private String attendant;

    private Boolean status;



}
