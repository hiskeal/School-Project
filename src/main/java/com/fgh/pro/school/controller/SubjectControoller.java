package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.SubjectRequestDto;
import com.fgh.pro.school.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api")
public class SubjectControoller {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/save")
    public ResponseDto saveSubject(@RequestBody SubjectRequestDto subjectRequestDto) {
        return subjectService.saveSubject(subjectRequestDto);
    }

    @PutMapping("/update/{id}")
    public ResponseDto updateSubject(@RequestBody SubjectRequestDto subjectRequestDto, @PathVariable Long id) {

        return subjectService.updateSubject(subjectRequestDto, id);
    }
}
