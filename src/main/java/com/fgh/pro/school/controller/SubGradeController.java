package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.SubGradeRequestDto;
import com.fgh.pro.school.model.SubGrade;
import com.fgh.pro.school.service.SubGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api")
public class SubGradeController {

    @Autowired
    private SubGradeService subGradeService;

    @PostMapping("/saveSubjGrade")
    public ResponseDto saveSubjGrade(@RequestBody SubGradeRequestDto subGradeRequestDto) {

        return subGradeService.saveSubGrade(subGradeRequestDto);
    }

    @GetMapping("/listSubj")
    public SubGrade listSubject(@RequestParam("Id") Long subjectId) {
        return subGradeService.listSubjectId(subjectId);

    }

    @GetMapping("/listGrade")
    public SubGrade listGrade(@RequestParam("id") Long gradeId) {
        return subGradeService.listGradeId(gradeId);

    }
}
