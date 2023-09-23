package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.model.Employee;

import java.util.List;

public interface IEService {
    public List<Employee> getAllEmployeePeople();
    public Employee saveData(Employee employee);
}
