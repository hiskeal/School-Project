package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.StudentRequestDto;
import com.fgh.pro.school.dto.TeacherRequestDto;
import com.fgh.pro.school.model.Department;
import com.fgh.pro.school.model.StaffType;
import com.fgh.pro.school.model.Student;
import com.fgh.pro.school.model.Teacher;
import com.fgh.pro.school.repository.DepartmentRepo;
import com.fgh.pro.school.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private DepartmentRepo departmentRepo;


    public ResponseDto saveTeacher(TeacherRequestDto teacherRequestDto) {
        Department department = departmentRepo.findById(teacherRequestDto.getDepartmentId()).get();
        if (department == null) {
            return new ResponseDto(false, "department Id does not found");
        }

        Teacher teacher = new Teacher();
        teacher.setTeacherStatus("active");

//     person.setAccountStatus("Active");

        teacher.setAge(teacherRequestDto.getAge());
        teacher.setDob(teacherRequestDto.getDob());
        teacher.setEmail(teacherRequestDto.getEmail());
        teacher.setFirstName(teacherRequestDto.getFirstName());
        teacher.setLastName(teacherRequestDto.getLastName());
        teacher.setPhoneNumber(teacherRequestDto.getPhoneNumber());
        teacher.setPassword(teacherRequestDto.getPassword());
        teacher.setRegisteredDate(teacher.getRegisteredDate());
        teacher.setCreatedOn(new Date());
        teacher.setUpdatedOn(new Date());

        teacher.setDepartment(department);

        teacherRepository.save(teacher);

        return new ResponseDto(true, "Registered Successfully");
    }


    public ResponseDto updateTeacher(TeacherRequestDto teacherRequestDto, Long id) {

        Teacher teacher = teacherRepository.findById(id).get();


        // person.setAccountStatus("Active");

        teacher.setAge(teacherRequestDto.getAge());
        teacher.setDob(teacherRequestDto.getDob());
        teacher.setEmail(teacherRequestDto.getEmail());
        teacher.setFirstName(teacherRequestDto.getFirstName());
        teacher.setLastName(teacherRequestDto.getLastName());
        teacher.setPhoneNumber(teacherRequestDto.getPhoneNumber());
        teacher.setPassword(teacherRequestDto.getPassword());
        teacher.setRegisteredDate(teacherRequestDto.getRegisteredDate());
        teacher.setCreatedOn(new Date());
        teacher.setUpdatedOn(new Date());

        //teacher.setDepartment(department);

        teacherRepository.save(teacher);
        return new ResponseDto(true, "Updated Method");

    }

    public ResponseDto deleteTeacherById(Long id) {
        teacherRepository.deleteById(id);

        return new ResponseDto(true, "deleted successfully");
    }

    public List<Teacher> getTeacherById(Long id) {
        return (List<Teacher>) teacherRepository.findByid(id);



    }

    public List<Teacher> ListAll() {
        List<TeacherRequestDto> teacherRequestDto = new ArrayList<>();
        return (List<Teacher>) teacherRepository.findAll();
    }


    public ResponseDto active(Long id) {
        Teacher teacher = teacherRepository.findById(id).get();

        if (teacher.getTeacherStatus().equals("active")) {
            teacher.setTeacherStatus("Suspend");

        } else if (teacher.getTeacherStatus().equals("Suspend")) {
            teacher.setTeacherStatus("active");
        }
        teacherRepository.save(teacher);
        return new ResponseDto(true, "active or deactivate");
    }



    public List<Teacher> listTeacherByFirstName(String name) {
        return teacherRepository.findByfirstName(name);


//                new ResponseDto(true, "Get Each Result By Name");

    }


}