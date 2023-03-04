package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.StudentRequestDto;
import com.fgh.pro.school.dto.StudentResponseDto;
import com.fgh.pro.school.model.Student;
import com.fgh.pro.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService; // Dependency Injection

//    public StudentController(StudentService studentService) {
//        super();
//        this.studentService = studentService;
//    }


    @GetMapping("/getStudents")
    public List<Student> listStudents () {
        return studentService.ListAll();

    }

//    @GetMapping("/students/new")
//    public String createStudentForm(Model model) {
//
//        // create student object to hold student form data
//        Student student = new Student();
//        model.addAttribute("student", student);
//        return "create_student";
//
//    }

    @PostMapping("/saveStudents")
    public ResponseDto saveStudent(@RequestBody StudentRequestDto studentRequestDto) {

        return studentService.saveStudent(studentRequestDto);

    }

//    @GetMapping("/students/edit/{id}")
//    public String editStudentForm(@PathVariable Long id, Model model) {
//        model.addAttribute("student", studentService.getStudentById(id));
//        return "edit_student";
//    }

    @PutMapping("/saveStudents/{id}")
    public ResponseDto updateStudent(@RequestBody StudentRequestDto studentRequestDto, @PathVariable Long id) {

       return  studentService.updateStudent(studentRequestDto, id);

    }

    @GetMapping("/listPerson")
    public List<Student> ListAll() {
        return studentService.ListAll();
    }

    @GetMapping("/getStudent")
    public List<StudentResponseDto> getAllStudent() {
       return studentService.getStudent();
    }

    @GetMapping("/getAllStudents/{id}")
    public ResponseDto getStudent(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }


    @GetMapping("/getFirstName")
    public List<Student> getFistName(@RequestParam("firstName") String name) {
       return studentService.findByName(name);

    }
    // handler method to handle delete student request

    @DeleteMapping("/deleteStudents/{id}")
    public ResponseDto deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudentById(id);

    }
}
