package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.SubjectRequestDto;
import com.fgh.pro.school.model.Subject;
import com.fgh.pro.school.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.Instant;
import java.util.Date;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    public ResponseDto saveSubject(SubjectRequestDto subjectRequestDto) {

        Subject subj = new Subject();
        subj.setSubjectName(subjectRequestDto.getSubjectName());
        subj.setCreatedOn(new Date());
        subj.setUpdatedOn(Instant.now());
        subj.setSubAbbreviation(subjectRequestDto.getSubAbbreviation());

        subjectRepo.save(subj);
        return new ResponseDto(true, "saved successfully");
    }

    public ResponseDto updateSubject(SubjectRequestDto subjectRequestDto, Long id) {

        Subject subject = subjectRepo.findById(id).get();

        subject.setSubjectName(subjectRequestDto.getSubjectName());
        subject.setCreatedOn(new Date());
        subject.setUpdatedOn(Instant.now());
        subject.setSubAbbreviation(subjectRequestDto.getSubAbbreviation());

        subjectRepo.save(subject);

        return new ResponseDto(true, "updated successfully");
    }
}
