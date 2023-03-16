package com.fgh.pro.school.dto;

import com.fgh.pro.school.model.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffTypeRequestDto {



    private String name;
    private Long staff;
}
