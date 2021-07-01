package com.springrest.springrest.service;

import com.springrest.springrest.Dto.*;
import com.springrest.springrest.dao.EmployeeAddressDao;
import com.springrest.springrest.dao.EmployeeDao;
import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.entities.EmployeeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    @Autowired
    private EmployeeAddressDao employeeAddressDao;
    public List<Employee> getEmployees() {

        return employeeDao.findAll();
    }

    public EmployeeDetailsRequestDto addEmployee(EmployeeDetailsRequestDto employeeDetailsRequestDto) throws Exception {

        Employee employee = new Employee();
        employee.setSalary(employeeDetailsRequestDto.getSalary());
        employee.setName(employeeDetailsRequestDto.getName());
        employee.setDob(employeeDetailsRequestDto.getDob());
        EmployeeAddress employeeAddress =
        employeeAddressDao.findById(employeeDetailsRequestDto.getEmployeeAddressId()
        ).orElseThrow(() ->new Exception());
        employee.setEmployeeAddress(employeeAddress);
        employeeDao.save(employee);
        return employeeDetailsRequestDto;
    }


    public Employee updateEmployee(Employee employee){

        employeeDao.save(employee);
        return employee;
    }

    public void deleteEmployee(long parseLong) {

        Employee employee = employeeDao.getById(parseLong);

        employeeDao.delete(employee);
    }

    public Employee getEmployeesById(long employeeId) {

        Employee employee = null;

        return employeeDao.getById(employeeId);
    }
}


