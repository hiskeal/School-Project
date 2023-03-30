package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.TeacherRequestDto;
import com.fgh.pro.school.model.Teacher;
import com.fgh.pro.school.repository.DepartmentRepo;
import com.fgh.pro.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private DepartmentRepo departmentRepo;


    @PostMapping("/saveTeacher")
    public ResponseDto saveTeacher(@RequestBody TeacherRequestDto teacherRequestDto) {

        return teacherService.saveTeacher(teacherRequestDto);
    }

    @PutMapping("/saveTeacher/{id}")
    public ResponseDto updateTeacher(@RequestBody TeacherRequestDto teacherRequestDto, @PathVariable Long id) {

        return teacherService.updateTeacher(teacherRequestDto, id);
    }

    //todo
    @GetMapping("/getById/{id}")
    public List<Teacher> getTeacher(@PathVariable ("id")Long id) {

        return teacherService.getTeacherById(id);
    }

    @GetMapping("/listTeacher")
    public List<Teacher> listAll() {

        return teacherService.ListAll();
    }

    @DeleteMapping("/deleteTeacher/{id}")
    public ResponseDto deleteTeacher(@PathVariable Long id) {

        return teacherService.deleteTeacherById(id);
    }

    @PostMapping("/active/{id}")
    public ResponseDto active(@PathVariable Long id) {
        return teacherService.active(id);



    }
    @GetMapping("/listTeacherByName")
    public List<Teacher> listTeacherByName(@RequestParam ("Name") String Name) {

        return teacherService.listTeacherByFirstName(Name);


    }



}