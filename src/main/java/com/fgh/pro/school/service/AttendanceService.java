package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.AttendanceRequestDto;
import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.model.Attendance;
import com.fgh.pro.school.repository.AttendanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    AttendanceRepo attendanceRepo;

    public ResponseDto save(AttendanceRequestDto attendanceRequestDto) {

        Attendance atndce = new Attendance();

        atndce.setAttendant(attendanceRequestDto.getAttendant());
        atndce.setCreatedOn(new Date());
        atndce.setDate(new Date());
        atndce.setStatus(attendanceRequestDto.getStatus());
        atndce.setUpdatedOn(new Date());

        attendanceRepo.save(atndce);
        return new  ResponseDto(true, "saved successfully");
    }

    public ResponseDto update(AttendanceRequestDto attendanceRequestDto, Long attendanceId) {

        Attendance attendance = attendanceRepo.findById(attendanceId).get();

        attendance.setAttendant(attendanceRequestDto.getAttendant());
        attendance.setCreatedOn(new Date());
        attendance.setDate(new Date());
        attendance.setStatus(attendanceRequestDto.getStatus());
        attendance.setUpdatedOn(new Date());

        attendanceRepo.save(attendance);
        return new ResponseDto(true, "Grade Updated");
    }

    public ResponseDto delete(Long id) {

        attendanceRepo.deleteById(id);

        return new ResponseDto(true, "Delete successfully");
    }

    public List<Attendance> getAllAttendances() {

        List<AttendanceRequestDto> attendanceRequestDto = new ArrayList<>();

        return (List<Attendance>) attendanceRepo.findAll();
    }

    public ResponseDto getAttendanceById(Long id) {
        attendanceRepo.findById(id);

        return new ResponseDto(true, "Get All Grades By ID");
    }



}
