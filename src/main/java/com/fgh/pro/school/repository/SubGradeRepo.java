package com.fgh.pro.school.repository;

import com.fgh.pro.school.model.SubGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubGradeRepo extends JpaRepository<SubGrade, Long> {

    SubGrade findBySubjectId(Long subjectId);

  //  SubGrade findByGrade(Long gradeId);

    SubGrade findByGradeId(Long gradeId);
}
