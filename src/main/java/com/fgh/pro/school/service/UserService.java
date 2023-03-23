package com.fgh.pro.school.service;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.UserRequestDto;
import com.fgh.pro.school.model.User;
import com.fgh.pro.school.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public ResponseDto save(UserRequestDto userRequestDto) {

        User usr = new User();

        User user = userRepo.findByUserName(userRequestDto.getUserName());
        if (user == null) {

            String password = bCryptPasswordEncoder.encode(userRequestDto.getPassword());
            usr.setPassword(password);
            usr.setUserName(userRequestDto.getUserName());

            userRepo.save(usr);
            return new ResponseDto(true, "user saved");
        } else
            return new ResponseDto(false, "user has taken");
    }
}