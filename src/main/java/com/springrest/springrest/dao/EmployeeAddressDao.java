package com.springrest.springrest.dao;

import com.springrest.springrest.entities.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAddressDao extends JpaRepository<EmployeeAddress,Long> {
}
