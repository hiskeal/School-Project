package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.StaffTypeRequestDto;
import com.fgh.pro.school.model.StaffType;
import com.fgh.pro.school.service.StaffTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
@RestController
public class StaffTypeController {

    @Autowired
    StaffTypeService staffTypeService;

    @PostMapping("/createstafftype")
    public ResponseDto CreateStaffType(@RequestBody StaffTypeRequestDto staffTypeRequestDto) {
        return staffTypeService.CreateStaffType(staffTypeRequestDto);
    }

    @PutMapping("/updatestafftype")
    public ResponseDto UpdateStaffType(@RequestBody StaffTypeRequestDto staffTypeRequestDto, @PathVariable Long Id) {
        return staffTypeService.UpdateStaffType(staffTypeRequestDto, Id);
    }

}