package com.fgh.pro.school.repository;

import com.fgh.pro.school.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Long> {


  //  List<Object> findBySubjectId(Long subjectId);
}
