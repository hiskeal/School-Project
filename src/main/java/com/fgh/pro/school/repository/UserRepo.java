package com.fgh.pro.school.repository;

import com.fgh.pro.school.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUserName(String userName);
   // Boolean existsByUserName(String userName);


}
