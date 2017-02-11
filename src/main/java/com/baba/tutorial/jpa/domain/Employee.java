package com.baba.tutorial.jpa.domain;

import javax.persistence.*;

/**
 * Created by Babaprakash Dabbara on 09-02-2017.
 */
@Entity
@Table
public class Employee {

    @Id
    private Integer employeeId;

    private String employeeName;

    private String designation;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
