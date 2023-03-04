package com.fgh.pro.school.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "department_address")
    private String departmentAddress;

    @Column(name = "department_code")
    private String departmentCode;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;


    public Department(Long id, String departmentName, String departmentAddress, String departmentCode, Date createdOn, Date updatedOn) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Department() {
    }

    public Long getId() {
        return this.id;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public String getDepartmentAddress() {
        return this.departmentAddress;
    }

    public String getDepartmentCode() {
        return this.departmentCode;
    }

    public Date getCreatedOn() {
        return this.createdOn;
    }

    public Date getUpdatedOn() {
        return this.updatedOn;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}