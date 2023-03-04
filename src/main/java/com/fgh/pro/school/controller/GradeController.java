package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.GradeRequestDto;
import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.model.Grade;
import com.fgh.pro.school.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @PostMapping("/saveGrade")
    public ResponseDto saveGrade(@RequestBody GradeRequestDto gradeRequestDto) {

        return gradeService.save(gradeRequestDto);
    }

    @PutMapping("/saveGrade/{id}")
    public ResponseDto update(@RequestBody GradeRequestDto gradeRequestDto, @PathVariable Long id) {

        return gradeService.update(gradeRequestDto, id);
    }

    @DeleteMapping("/deleteGrade/{id}")
    public ResponseDto delete(@PathVariable Long id) {

        return gradeService.delete(id);
    }

    public List<Grade> gradeList() {

        return gradeService.getAllGrades();
    }

    @GetMapping("/getGrade/{id}")
    public ResponseDto getAllGradeById(@PathVariable Long id) {

        return gradeService.getAllGrades(id);
    }


}
