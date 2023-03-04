package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.GradeRequestDto;
import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.model.Grade;
import com.fgh.pro.school.repository.GradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GradeService {

    @Autowired
    private GradeRepo gradeRepo;

    public ResponseDto save(GradeRequestDto gradeRequestDto) {

        Grade grd = new Grade();
        grd.setName(gradeRequestDto.getName());
        grd.setDescription(gradeRequestDto.getDescription());
        grd.setCreatedOn(new Date());
        grd.setUpdatedOn(new Date());

        gradeRepo.save(grd);
        return new  ResponseDto(true, "saved successfully");
    }

    public ResponseDto update(GradeRequestDto gradeRequestDto, Long id) {

        Grade grds = gradeRepo.findById(id).get();

        grds.setName(gradeRequestDto.getName());
        grds.setDescription(gradeRequestDto.getDescription());
        grds.setCreatedOn(new Date());
        grds.setUpdatedOn(new Date());

//        return gradeRepo.findById(id)
//                .stream()
//                .map(this::CovertEntityDto)
//                .collect(Collectors.toList());

        gradeRepo.save(grds);
        return new ResponseDto(true, "Grade Updated");
    }

    public ResponseDto delete(Long id) {

        gradeRepo.deleteById(id);

        return new ResponseDto(true, "Delete successfully");
    }

    public List<Grade> getAllGrades() {

        List<GradeRequestDto> gradeRequestDtoList = new ArrayList<>();

        return (List<Grade>) gradeRepo.findAll();
    }

    public ResponseDto getAllGrades(Long id) {
        gradeRepo.findById(id);

        return new ResponseDto(true, "Get All Grades By ID");
    }
}
