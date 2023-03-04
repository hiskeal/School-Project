package com.fgh.pro.school.repository;

import com.fgh.pro.school.model.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepo extends JpaRepository<Level, Long> {

}
