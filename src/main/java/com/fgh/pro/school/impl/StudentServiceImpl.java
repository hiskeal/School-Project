package com.fgh.pro.school.impl;

import com.fgh.pro.school.model.Student;
import com.fgh.pro.school.repository.StudentRepository;
import com.fgh.pro.school.service.StudentService;

import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//public class StudentServiceImpl implements StudentService {

  //  @Autowired
//    private StudentRepository studentRepository;
//
//    public StudentServiceImpl(StudentRepository studentRepository) {
//        super();
//        this.studentRepository = studentRepository;
//    }
//
//    @Override
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    @Override
//    public Student saveStudent(Student student) {
//        return studentRepository.save(student);
//    }
//
//    @Override
//    public Student getStudentById(Long id) {
//        return studentRepository.findById(id).get();
//    }
//
//    @Override
//    public Student updateStudent(Student student, Long id) {
//        return studentRepository.save(student);
//    }
//
////    @Override
////    public Student updateStudent(Long id) {
////        return studentRepository.getReferenceById(id);
////    }
//
////    @Override
////    public Student getStudentById(Long id) {
////        return studentRepository.save(getStudentById(id));
////    }
//
//
//
//    @Override
//    public void deleteStudentById(Long id) {
//
//    }
//  }
