package com.springrest.springrest.service;

import com.springrest.springrest.dao.EmployeeAddressDao;
import com.springrest.springrest.entities.EmployeeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class EmployeeAddressServiceImpl implements EmployeeAddressService {

    @Autowired
    private EmployeeAddressDao employeeAddressDao;

    public List<EmployeeAddress> getEmployeeAddress(){
        return employeeAddressDao.findAll();
    }

    public EmployeeAddress addEmployeeAddress(EmployeeAddress employeeAddress){
        employeeAddressDao.save(employeeAddress);
        return employeeAddress;
    }

    public EmployeeAddress updateEmployeeAddress(EmployeeAddress employeeAddress){
        employeeAddressDao.save(employeeAddress);
        return employeeAddress;
    }

    public void deleteEmployeeAddress(long parseLong) {

        EmployeeAddress employeeAddress = employeeAddressDao.getById(parseLong);

        employeeAddressDao.delete(employeeAddress);
    }
}
