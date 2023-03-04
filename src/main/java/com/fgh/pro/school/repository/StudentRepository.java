package com.fgh.pro.school.repository;

import com.fgh.pro.school.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

      @Query("SELECT s FROM Student s WHERE s.firstName LIKE %:firstName%")
      List<Student> findByfirstName(String firstName);

      Student  findByPhoneNumber(Long phoneNumber);

}
