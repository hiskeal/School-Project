package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.UserRequestDto;
import com.fgh.pro.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/user")
    public ResponseDto save(@RequestBody UserRequestDto userRequestDto) {

        return userService.save(userRequestDto);
    }

}
