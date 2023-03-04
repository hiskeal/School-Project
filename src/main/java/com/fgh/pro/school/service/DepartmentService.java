package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.DepartmentRequestDto;
import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.model.Department;
import com.fgh.pro.school.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
   private DepartmentRepo departmentRepo;

    public ResponseDto saveDepartment(DepartmentRequestDto departmentRequestDto) {

        Department department = new Department();

        department.setDepartmentCode(departmentRequestDto.getDepartmentCode());
        department.setDepartmentAddress(departmentRequestDto.getDepartmentLocation());
        department.setDepartmentName(departmentRequestDto.getDepartmentName());
        department.setCreatedOn(new Date());
        department.setUpdatedOn(new Date());

        departmentRepo.save(department);

        return new ResponseDto(true, "save department successfully");

    }

    public ResponseDto updateDepartment(DepartmentRequestDto departmentRequestDto, Long id) {

        Department department = departmentRepo.findById(id).get();

        department.setDepartmentCode(departmentRequestDto.getDepartmentCode());
        department.setDepartmentAddress(departmentRequestDto.getDepartmentLocation());
        department.setDepartmentName(departmentRequestDto.getDepartmentName());
        department.setCreatedOn(new Date());
        department.setUpdatedOn(new Date());

        departmentRepo.save(department);

        return new ResponseDto(true, "department updated");
    }

//    public ResponseDto deleteDepartment(Long id) {
//        departmentRepo.deleteById(id);
//
//        return new ResponseDto(true, "deleted successfully");
//    }

    public ResponseDto getDepartmentById(Long id) {
        departmentRepo.findById(id).get();

        return new ResponseDto(true, "Get Each Result By Id");

    }

    public List<Department> ListAll() {
        List<DepartmentRequestDto> departmentRequestDto = new ArrayList<>();
        return (List<Department>) departmentRepo.findAll();
    }

    public ResponseDto deleteDepartmentById(Long id) {
        departmentRepo.deleteById(id);
        return new ResponseDto(true, "deleted successfully");
    }
}
