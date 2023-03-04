package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.StudentRequestDto;

import com.fgh.pro.school.dto.StudentResponseDto;
import com.fgh.pro.school.model.Student;

import com.fgh.pro.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
//    private DepartmentRepo departmentRepo;


    public ResponseDto saveStudent(StudentRequestDto studentRequestDto) {

        Student student = new Student();
        // person.setAccountStatus("Active");

        Student s1 = studentRepository.findByPhoneNumber(studentRequestDto.getPhoneNumber());
        if (s1 == null) {

            student.setAge(studentRequestDto.getAge());
            student.setDob(studentRequestDto.getDob());
            student.setEmail(studentRequestDto.getEmail());
            student.setFirstName(studentRequestDto.getFirstName());

            student.setLastName(studentRequestDto.getLastName());
            student.setPhoneNumber(studentRequestDto.getPhoneNumber());
            student.setPassword(studentRequestDto.getPassword());
            student.setRegisteredDate(studentRequestDto.getRegisteredDate());
            student.setCreatedOn(new Date());
            student.setUpdatedOn(new Date());

            //   student.setDepartment(personRequestDto.getDepartment());
            studentRepository.save(student);

            return new ResponseDto(true, "Registered Successfully");
        } else
            return new ResponseDto(false, "phone number has taken");

    }
        public ResponseDto updateStudent(StudentRequestDto studentRequestDto, Long id) {

        Student student = studentRepository.findById(id).get();
        // person.setAccountStatus("Active");


        student.setAge(studentRequestDto.getAge());
        student.setDob(studentRequestDto.getDob());
        student.setEmail(studentRequestDto.getEmail());
        student.setFirstName(studentRequestDto.getFirstName());

        student.setLastName(studentRequestDto.getLastName());
        student.setPhoneNumber(studentRequestDto.getPhoneNumber());
        student.setPassword(studentRequestDto.getPassword());
        student.setRegisteredDate(studentRequestDto.getRegisteredDate());
        student.setCreatedOn(new Date());
        student.setUpdatedOn(new Date());

        studentRepository.save(student);
        return new ResponseDto(true, "Updated Method");

    }

    public ResponseDto deleteStudentById(Long id) {
        studentRepository.deleteById(id);

        return new ResponseDto(true, "deleted successfully");
    }

    public ResponseDto getStudentById(Long id) {
         studentRepository.findById(id).get();

           return new ResponseDto(true, "Get Each Result By Id");

    }

    public List<Student> findByName(String name) {
       return studentRepository.findByfirstName(name);

                //new ResponseDto(true, "found name !!");
    }

    public List<Student> ListAll() {
        List<StudentRequestDto> studentRequestDtos = new ArrayList<>();
        return (List<Student>) studentRepository.findAll();
    }

    public List<StudentResponseDto> getStudent() {

        List<StudentResponseDto> responseDto = new ArrayList<>();
        List<Student> studentList = studentRepository.findAll();

        studentList.forEach(student -> {
            StudentResponseDto studentResponseDto = new StudentResponseDto();

            studentResponseDto.setAge(student.getAge());
            studentResponseDto.setId(student.getId());
            studentResponseDto.setFirstName(student.getFirstName());
            studentResponseDto.setLastName(student.getLastName());
            studentResponseDto.setEmail(student.getEmail());

            responseDto.add(studentResponseDto);

        });

        return responseDto;
    }
}
