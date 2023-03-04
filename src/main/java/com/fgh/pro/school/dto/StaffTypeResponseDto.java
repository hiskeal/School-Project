package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffTypeResponseDto {

    private Long id;

    private String name;

    private Long staff_type_id;

    private Date createdOn;

    private Date updatedOn;

}
