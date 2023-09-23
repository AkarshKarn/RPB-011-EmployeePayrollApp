package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.repo.ERepo;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class EService {
    private List<Employee> employeelist = new ArrayList<>();
    @Autowired
    ERepo eRepo;


    public Employee addEmployeeDto(EmployeeDto employeeDto) {
        Employee employee = new Employee(employeeDto);
        employeelist.add(employee);
        return eRepo.save(employee);
    }

    public Employee greetById(int id) {
        return eRepo.findById(id).orElse(null);

    }

    public String deleteEmployee(int id) {
        eRepo.deleteById(id);
        return "deleted successfully";
    }

    public Employee updateEmployee(@NotNull EmployeeDto emp, int id){
        Employee empobject = new Employee(emp);
        empobject.setEmployeeid(id);
        return eRepo.save(empobject);
    }

    public List<Employee> getAllEmployeePeople() {
        return eRepo.findAll();
    }



}


//    public EmployeeDto addEmployee(EmployeeDto employeeDto){
//        return eRepo.save(employeeDto);
//    }
//
//    public String deleteById(int id) {
//        eRepo.deleteById(id);
//        return "deleted successfully";
//    }
//    public EmployeeDto updateById(int id,EmployeeDto employeeDto){
//        employeeDto.setId(id);
//        return eRepo.save(employeeDto);
//    }
//
//    public EmployeeDto greetById(int id) {
//        return eRepo.findById(id).orElse(null);
//    }
//
//    public EmployeeDto saveData(EmployeeDto employeeDto) {
//        return employeeDto;
//    }
//
//  public List<EmployeeDto> getAllEmployeeDtoPeople() {
//        return eRepo.findAll();
//    }
//
//}
