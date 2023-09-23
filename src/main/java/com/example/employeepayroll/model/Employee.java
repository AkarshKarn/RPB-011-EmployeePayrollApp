package com.example.employeepayroll.model;

import com.example.employeepayroll.dto.EmployeeDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;
    private String name;
    private String startDate;
    private Long salary;
    private String gender;
    private String department;
    private String note;
    private String profilePic;

    public Employee(EmployeeDto employeeDto) {
        this.name = employeeDto.name;
        this.salary = employeeDto.salary;
        this.gender = employeeDto.gender;
        this.startDate = employeeDto.startDate;
        this.note = employeeDto.note;
        this.profilePic = employeeDto.profilePic;
        this.department = employeeDto.department;


    }


    public Employee(int employeeid ,EmployeeDto employeeDto) {
        this.employeeid = employeeid;
        this.name = employeeDto.name;
        this.salary = employeeDto.salary;
        this.gender = employeeDto.gender;
        this.startDate = employeeDto.startDate;
        this.note = employeeDto.note;
        this.profilePic = employeeDto.profilePic;
        this.department = employeeDto.department;


    }

}

