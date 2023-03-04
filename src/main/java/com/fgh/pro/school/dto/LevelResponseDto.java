package com.fgh.pro.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LevelResponseDto {

    private Long id;
    private String name;

    private String principal;

    private Long gradeId;

}
