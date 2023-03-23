package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.JwtRequestDto;
import com.fgh.pro.school.dto.JwtResponseDto;
import com.fgh.pro.school.service.JwtRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/api")
public class JwtRequestController {

   private AuthenticationManager authenticationManager;


    private UserDetailsService userDetailsService;

    @Autowired
    private JwtRequestService jwtRequestService;

    public JwtRequestController() {

    }


    @PostMapping("/saveJwtSecurity")
    public ResponseEntity saveJwtRequest(@RequestBody JwtRequestDto jwtRequestDto) throws Exception {
        try {

            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequestDto.getUserName(), jwtRequestDto.getPassword()));
            final UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequestDto.getUserName());
            final String token = jwtRequestService.generateToken(userDetails);


            return ResponseEntity.ok(new JwtResponseDto(token));

        } catch (Exception ex) {
            throw new Exception("user name doesn't correct", ex);
        }

    }


}
