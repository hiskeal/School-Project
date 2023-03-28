package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.StaffRequestDto;
import com.fgh.pro.school.model.Staff;
import com.fgh.pro.school.model.StaffType;
import com.fgh.pro.school.repository.StaffRepository;
import com.fgh.pro.school.repository.StaffTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    @Autowired
    StaffRepository staffRepository;

    @Autowired
    StaffTypeRepo staffTypeRepo;
    public ResponseDto createStaff(StaffRequestDto staffRequestDto) {

        StaffType  staffType = staffTypeRepo.findById(staffRequestDto.getStaffTypeId()).get();
        if(staffType==null){
            return new ResponseDto(false,"StaffType Id does not found");
        }

        Staff staff = new Staff();
        staff.setStaffStatus("active");

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
public  ResponseDto updateStaff(StaffRequestDto staffRequestDto, Long id){

    StaffType  staffType = staffTypeRepo.findById(staffRequestDto.getStaffTypeId()).get();

    Staff staff = staffRepository.findById(id).get();
    staff.setAddress(staffRequestDto.getAddress());
    staff.setName(staffRequestDto.getName());
    staff.setLastName(staffRequestDto.getLastName());
    staff.setMotherLastName(staffRequestDto.getMotherLastName());
    staff.setFatherLastName(staffRequestDto.getFatherLastName());
    staff.setGender(staffRequestDto.getGender());
    staff.setDob(staffRequestDto.getDob());
    staff.setDateOfHiring(staffRequestDto.getDateOfHiring());
    //staff.setFormation(staffRequestDto.getFormation());
   // staff.setSalary(staffRequestDto.getSalary());
    staff.setMotherContact(staffRequestDto.getMotherContact());
    staff.setFatherContact(staffRequestDto.getFatherContact());

    staff.setStaffType(staffType);

    staffRepository.save(staff);

    return new ResponseDto(true, "update successfully");

}
    //todo how to delete,suspend ,active staff

    public ResponseDto deleteStaffById(Long id) {
        staffRepository.deleteById(id);
        return new ResponseDto(true, "staff deleted successfully");
    }

    public ResponseDto active(Long id) {
        Staff staff = staffRepository.findById(id).get();
        if (staff.getStaffStatus().equals("active")){
            staff.setStaffStatus("suspend");
        } else if (staff.getStaffStatus().equals("suspend")) {
            staff.setStaffStatus("active");
        }

        staffRepository.save(staff);
        return new ResponseDto(true, "Active or Deactivate");

    }

}