package com.springrest.springrest.controller;


import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.entities.EmployeeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import com.springrest.springrest.service.EmployeeAddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeAddressController {

    @Autowired
    private EmployeeAddressService employeeAddressService;

    @GetMapping("/home12")
    public String home(){
        return  "this is my appddvsdhfkjsdhfksjdhfljsdfcsdv";
    }

    @GetMapping("/employeeAddress")
    public List<EmployeeAddress> getEmployeeAddress(){
        return this.employeeAddressService.getEmployeeAddress();

    }

    @PostMapping("/employeeAddress")
    public EmployeeAddress addEmployeeAddress(@RequestBody EmployeeAddress employeeAddress){
        return this.employeeAddressService.addEmployeeAddress(employeeAddress);
    }

    @PutMapping("/employeeAddress")
    public EmployeeAddress updateEmployeeAddress(@RequestBody EmployeeAddress employeeAddress){
        return this.employeeAddressService.updateEmployeeAddress(employeeAddress);
    }

    @DeleteMapping("/employeeAddress/{employeeAddressId}")
    public void deleteEmployeeAddress(@PathVariable String employeeAddressId){
        this.employeeAddressService.deleteEmployeeAddress(Long.parseLong(employeeAddressId));
    }
}
