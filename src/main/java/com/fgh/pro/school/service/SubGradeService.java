package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.SubGradeRequestDto;
import com.fgh.pro.school.model.Grade;
import com.fgh.pro.school.model.SubGrade;
import com.fgh.pro.school.model.Subject;
import com.fgh.pro.school.repository.GradeRepo;
import com.fgh.pro.school.repository.SubGradeRepo;
import com.fgh.pro.school.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SubGradeService {

    @Autowired
    private SubGradeRepo subGradeRepo;

    @Autowired
    private GradeRepo gradeRepo;

    @Autowired
    private SubjectRepo subjectRepo;

    public ResponseDto saveSubGrade(SubGradeRequestDto subGradeRequestDto) {

            Grade grade = gradeRepo.findById(subGradeRequestDto.getGradeId()).get();
        SubGrade subGrade = subGradeRepo.findById(subGradeRequestDto.getSubjectId()).get();
        Subject subject = subjectRepo.findById(subGradeRequestDto.getSubjectId()).get();

        SubGrade subgrd = new SubGrade();

        var grd = subGradeRepo.findById(subGradeRequestDto.getGradeId());
        if (grd == null) {
                  subgrd.setGrade(grade);
                  subgrd.setSubject(subject);

            subgrd.setCreatedOn(new Date());
            subgrd.setUpdatedOn(new Date());


            subGradeRepo.save(subgrd);
            return new ResponseDto(true, "saved successfully");
        } else
            return new ResponseDto(false, "SubjectId not valid");

    }
        public SubGrade listSubjectId (Long subjectId){
           SubGrade subGrade = subGradeRepo.findBySubjectId(subjectId);


            return subGrade;
        }

    public SubGrade listGradeId(Long gradeId){
            SubGrade subGrade = subGradeRepo.findByGradeId(gradeId);
            return subGrade;

        }

}
