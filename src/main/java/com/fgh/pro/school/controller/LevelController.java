package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.LevelRequestDto;
import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api")
public class LevelController {

    @Autowired
    private LevelService levelService;

    @PostMapping("/saveLevel")
    public ResponseDto save(@RequestBody LevelRequestDto levelRequestDto) {

        return levelService.saveLevel(levelRequestDto);
    }
}
