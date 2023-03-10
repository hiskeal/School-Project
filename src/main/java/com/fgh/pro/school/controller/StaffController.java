package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.StaffRequestDto;
import com.fgh.pro.school.dto.SubjectRequestDto;
import com.fgh.pro.school.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/staff")
@RestController
public class StaffController {
    @Autowired
    StaffService staffService;

    @PostMapping("saveStaff")

    public ResponseDto createStaff(@RequestBody StaffRequestDto staffRequestDto) {
        return staffService.createStaff(staffRequestDto);
    }
    @PutMapping("/updateStaff/{id}")
    public ResponseDto updateStaff(@RequestBody StaffRequestDto staffRequestDto, @PathVariable Long id) {

        return staffService.updateStaff(staffRequestDto, id);

    }



}