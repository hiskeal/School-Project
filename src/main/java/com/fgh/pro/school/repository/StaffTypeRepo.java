package com.fgh.pro.school.repository;

import com.fgh.pro.school.model.StaffType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffTypeRepo extends CrudRepository<StaffType, Long> {
}
