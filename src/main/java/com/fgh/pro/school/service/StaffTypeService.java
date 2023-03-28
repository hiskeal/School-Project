package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.StaffTypeRequestDto;
import com.fgh.pro.school.model.StaffType;
import com.fgh.pro.school.repository.StaffTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffTypeService {

    @Autowired
    StaffTypeRepo staffTypeRepo;


    public ResponseDto CreateStaffType(StaffTypeRequestDto staffTypeRequestDto) {
        StaffType staffType = new StaffType();

        staffType.setName(staffTypeRequestDto.getName());

        staffTypeRepo.save(staffType);

        return new ResponseDto(true, "Create StaffType Successfully");

    }

    public ResponseDto UpdateStaffType(StaffTypeRequestDto staffTypeRequestDto, Long Id) {


        StaffType staffType = staffTypeRepo.findById(Id).get();

        staffType.setStaff(staffType.getStaff());

        staffTypeRepo.save(staffType);
        return new ResponseDto(true, "Update StaffType Successfully");
    }

    public List<StaffType> ListAll() {
        List<ResponseDto> responseDtos = new ArrayList<>();
        return (List<StaffType>) ListAll();

    }

}