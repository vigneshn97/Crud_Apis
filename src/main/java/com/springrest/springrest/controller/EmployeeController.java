package com.springrest.springrest.controller;

import com.springrest.springrest.Dto.EmployeeDetailsRequestDto;
import com.springrest.springrest.Dto.EmployeeResponseDto;
import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        return this.employeeService.getEmployees();
    }


    @PostMapping("/employees")
    public EmployeeDetailsRequestDto addEmployee(@RequestBody EmployeeDetailsRequestDto employeeDetailsRequestDto) throws Exception {
        return this.employeeService.addEmployee(employeeDetailsRequestDto);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable String employeeId){
        this.employeeService.deleteEmployee(Long.parseLong(employeeId));
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable String employeeId){
        return this.employeeService.getEmployeesById(Long.parseLong(employeeId));
    }
}
