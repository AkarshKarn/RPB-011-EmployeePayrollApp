package com.example.employeepayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class EmployeeDto {
    @NotEmpty(message = "employee cannot be null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    public String name;
    @JsonFormat(pattern = "dd mm yyyy")
    @NotEmpty (message = "start date should not be empty")
    public String startDate;
    @Pattern(regexp = "male|female", message = "gender needs to be male or female")
    public String gender;
    @NotBlank(message = "department should not be empty")
    public String department;
    @NotBlank(message = "note should not be empty")
    public String note;
    @NotBlank(message = "profile pic should not be empty")
    public String profilePic;
    @Min(value = 500,message = "minimum wages should not be less than 500")
    public Long salary;


    public EmployeeDto(String name, String startDate, String gender, String department, String note, String profilePic, Long salary) {
        this.name = name;
        this.startDate = startDate;
        this.gender = gender;
        this.department = department;
        this.note = note;
        this.profilePic = profilePic;
        this.salary = salary;
    }
}

