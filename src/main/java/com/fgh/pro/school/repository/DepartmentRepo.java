package com.fgh.pro.school.repository;


import com.fgh.pro.school.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Long> {


}
