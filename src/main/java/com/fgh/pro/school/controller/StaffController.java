package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.StaffRequestDto;
import com.fgh.pro.school.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}