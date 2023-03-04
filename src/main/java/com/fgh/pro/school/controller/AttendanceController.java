package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.AttendanceRequestDto;
import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.model.Attendance;
import com.fgh.pro.school.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class AttendanceController {

    @Autowired
    AttendanceService attendanceService;

    @GetMapping("/getAttendance/{id}")
    public ResponseDto getAttendance(@PathVariable Long id) {

        return attendanceService.getAttendanceById(id);
    }

    @GetMapping("/getAllAtendances")
    public List<Attendance> getAllAttendances() {
        return attendanceService.getAllAttendances();
    }

    @PostMapping("/saveAttandance")
    public ResponseDto saveAttendance(@RequestBody AttendanceRequestDto attendanceRequestDto) {

        return attendanceService.save(attendanceRequestDto);
    }

    @PutMapping("/updateAttendance/{id}")
    public ResponseDto update(@RequestBody AttendanceRequestDto attendanceRequestDto, @PathVariable Long id) {

        return attendanceService.update(attendanceRequestDto, id);
    }

    @DeleteMapping("/deleteAttendance/{id}")
    public ResponseDto delete(@PathVariable Long id) {
        return attendanceService.delete(id);

    }
}
