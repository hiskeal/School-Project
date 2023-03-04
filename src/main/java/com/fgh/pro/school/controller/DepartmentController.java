package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.DepartmentRequestDto;
import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.model.Department;
import com.fgh.pro.school.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDepartments")
    public ResponseDto saveDepartment(@RequestBody DepartmentRequestDto departmentRequestDto) {

        return departmentService.saveDepartment(departmentRequestDto);
    }

    @GetMapping("/getDepartments/{id}")
    public ResponseDto getDepartment(@PathVariable Long id) {

        return departmentService.getDepartmentById(id);
    }

    @PutMapping("/updateDepartments/{id}")
    public ResponseDto updaateDepartment(@RequestBody DepartmentRequestDto departmentRequestDto, @PathVariable Long id) {

        return departmentService.updateDepartment(departmentRequestDto, id);
    }


    @GetMapping("/listAll")
    public List<Department> ListAll() {
        return departmentService.ListAll();
    }

    public ResponseDto deleteDepartment(@PathVariable Long id) {

        return departmentService.deleteDepartmentById(id);
    }
}
