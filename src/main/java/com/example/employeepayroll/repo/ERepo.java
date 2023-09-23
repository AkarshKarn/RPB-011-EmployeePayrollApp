package com.example.employeepayroll.repo;

import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ERepo extends JpaRepository<Employee,Integer> {
}
