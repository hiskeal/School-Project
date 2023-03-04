package com.fgh.pro.school.repository;

import com.fgh.pro.school.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepo extends JpaRepository<Grade, Long> {


}
