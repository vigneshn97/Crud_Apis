package com.springrest.springrest.service;


import com.springrest.springrest.Dto.EmployeeDetailsRequestDto;
import com.springrest.springrest.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployees();

    public EmployeeDetailsRequestDto addEmployee(EmployeeDetailsRequestDto employee) throws Exception;

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(long parseLong);

    public Employee getEmployeesById(long employeeId);
}
