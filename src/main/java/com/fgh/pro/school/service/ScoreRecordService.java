package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.ScoreRecordRequestDto;
import com.fgh.pro.school.model.ScoreRecord;
import com.fgh.pro.school.model.Student;
import com.fgh.pro.school.model.Subject;
import com.fgh.pro.school.repository.ScoreRecordRepo;
import com.fgh.pro.school.repository.StudentRepository;
import com.fgh.pro.school.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreRecordService {

    @Autowired
    private ScoreRecordRepo scoreRecordRepo;

    @Autowired
   private SubjectRepo subjectRepo;

    @Autowired
    private StudentRepository studentRepository;

    public ResponseDto saveScoreRecord(ScoreRecordRequestDto scoreRecordRequestDto) {
        try {
            ScoreRecord scoreRecord = new ScoreRecord();

            Subject subject = subjectRepo.findById(scoreRecordRequestDto.getSubjectId()).get();

            Student student = studentRepository.findById(scoreRecordRequestDto.getStudentId()).get();

            scoreRecord.setFirstSemester(scoreRecordRequestDto.getFirstSemester());
            scoreRecord.setSecondSemester(scoreRecordRequestDto.getSecondSemester());
            scoreRecord.setThirdSemester(scoreRecordRequestDto.getThirdSemester());
            scoreRecord.setFinalGrade(scoreRecordRequestDto.getFinalGrade());

            scoreRecord.setSubject(subject);
            scoreRecord.setStudent(student);

            scoreRecordRepo.save(scoreRecord);


            return new ResponseDto(true, "score record save");

        } catch (Exception exception) {
            return new ResponseDto(false, "can not score record");
        }

    }
    public ResponseDto updateScoreRecord(ScoreRecordRequestDto scoreRecordRequestDto, Long id) {

        ScoreRecord scoreRecord = new ScoreRecord();
        if (id == null) {
            return new ResponseDto(true, "Id doesn't found");
        }

        Subject subject = subjectRepo.findById(scoreRecordRequestDto.getSubjectId()).get();
        if (scoreRecordRequestDto.getSubjectId() == null) {
            return new ResponseDto(false, "subjectId not found");
        }

        Student student = studentRepository.findById(scoreRecordRequestDto.getStudentId()).get();
        if (scoreRecordRequestDto.getStudentId() == null) {
            return new ResponseDto(false, "did not get studentId");
        }

        scoreRecord.setFirstSemester(scoreRecordRequestDto.getFirstSemester());
        scoreRecord.setSecondSemester(scoreRecordRequestDto.getSecondSemester());
        scoreRecord.setThirdSemester(scoreRecordRequestDto.getThirdSemester());
        scoreRecord.setFinalGrade(scoreRecordRequestDto.getFinalGrade());

        scoreRecord.setSubject(subject);
        scoreRecord.setStudent(student);

        scoreRecordRepo.save(scoreRecord);


        return new ResponseDto(true, "score record save") ;

    }
}
