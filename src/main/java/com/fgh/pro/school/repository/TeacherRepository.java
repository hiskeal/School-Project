package com.fgh.pro.school.repository;


import com.fgh.pro.school.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


//@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
