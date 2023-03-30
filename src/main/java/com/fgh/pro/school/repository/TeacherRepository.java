package com.fgh.pro.school.repository;


import com.fgh.pro.school.model.Student;
import com.fgh.pro.school.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {


    List<Teacher> findByfirstName(String firstName);

 List<Teacher> findByid(Long id);

}
