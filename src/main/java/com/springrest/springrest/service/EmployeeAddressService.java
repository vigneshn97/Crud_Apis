package com.springrest.springrest.service;

import com.springrest.springrest.Dto.EmployeeDetailsRequestDto;
import com.springrest.springrest.dao.EmployeeAddressDao;
import com.springrest.springrest.dao.EmployeeDao;
import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.entities.EmployeeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeAddressService {
    public  List<EmployeeAddress> getEmployeeAddress();

    public EmployeeAddress addEmployeeAddress(EmployeeAddress employeeAddress);

    public EmployeeAddress updateEmployeeAddress(EmployeeAddress employeeAddress);

    public void deleteEmployeeAddress(long parseLong);


}
