package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.StaffRequestDto;
import com.fgh.pro.school.model.Staff;
import com.fgh.pro.school.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class StaffService {

    @Autowired
    StaffRepository staffRepository;

    public ResponseDto createStaff(StaffRequestDto staffRequestDto) {

        Staff staff = new Staff();
        staff.setAddress(staffRequestDto.getAddress());
        staff.setName(staffRequestDto.getName());
        staff.setLastName(staffRequestDto.getLastName());
        staff.setMotherLastName(staffRequestDto.getMotherLastName());
        staff.setFatherLastName(staffRequestDto.getFatherLastName());
        staff.setGender(staffRequestDto.getGender());
        staff.setDob(staffRequestDto.getDob());
        staff.setDateOfHiring(staffRequestDto.getDateOfHiring());
        //staff.setFormation(staffRequestDto.getFormation());
        //staff.setSalary(staffRequestDto.getSalary());
        staff.setMotherContact(staffRequestDto.getMotherContact());
        staff.setFatherContact(staffRequestDto.getFatherContact());
        staffRepository.save(staff);


        return new ResponseDto(true, "Create successfully");
    }

    public ResponseDto updateStaff(StaffRequestDto staffRequestDto, Long id) {

        Staff staff = staffRepository.findById(id).get();
        staff.setAddress(staffRequestDto.getAddress());
        staff.setName(staffRequestDto.getName());
        staff.setLastName(staffRequestDto.getLastName());
        staff.setMotherLastName(staffRequestDto.getMotherLastName());
        staff.setFatherLastName(staffRequestDto.getFatherLastName());
        staff.setGender(staffRequestDto.getGender());
        staff.setDob(staffRequestDto.getDob());
        staff.setDateOfHiring(staffRequestDto.getDateOfHiring());
        staff.setFormation(staffRequestDto.getFormation());
// staff.setSalary(staffRequestDto.getSalary());
        staff.setMotherContact(staffRequestDto.getMotherContact());
        staff.setFatherContact(staffRequestDto.getFatherContact());
        staffRepository.save(staff);

        return new ResponseDto(true, "update successfully");

    }

    //todo how to delete,suspend ,active staff
    public ResponseDto deleteStaffById(Long id) {
        staffRepository.deleteById(id);
        return new ResponseDto(true, "deleted successfully");

    }


}