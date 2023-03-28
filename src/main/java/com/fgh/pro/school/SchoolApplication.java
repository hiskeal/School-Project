package com.fgh.pro.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
//@Configuration
//@EnableWebSecurity
public class SchoolApplication  {

//	@Bean
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//	}
//	@Bean
//	@Override
//	public AuthenticationManager authenticationManager() throws Exception {
//		return super.authenticationManager();
//	}
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();

	}

		public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

}
