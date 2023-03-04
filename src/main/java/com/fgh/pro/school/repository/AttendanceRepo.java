package com.fgh.pro.school.repository;

import com.fgh.pro.school.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepo extends JpaRepository<Attendance, Long> {

}
