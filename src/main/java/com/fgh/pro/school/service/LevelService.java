package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.LevelRequestDto;
import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.model.Grade;
import com.fgh.pro.school.model.Level;
import com.fgh.pro.school.repository.GradeRepo;
import com.fgh.pro.school.repository.LevelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelService {

    @Autowired
    private LevelRepo levelRepo;

    @Autowired
    private GradeRepo gradeRepo;

    public ResponseDto saveLevel(LevelRequestDto levelRequestDto) {

        Level level = new Level();
        Grade grade = gradeRepo.findById(levelRequestDto.getGradeId()).get();

        level.setName(levelRequestDto.getName());
        level.setPrincipal(levelRequestDto.getPrincipal());

        level.setGrade(grade);

        levelRepo.save(level);

        return new ResponseDto(true, "save level successfully");
    }
}
