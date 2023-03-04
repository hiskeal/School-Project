package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceResponseDto {


    private Long attendanceId;

    private Date createdOn;

    private Date updatedOn;

    private Date date;

    private Long studentId;

    private Boolean status;


    private String attendant;



}
