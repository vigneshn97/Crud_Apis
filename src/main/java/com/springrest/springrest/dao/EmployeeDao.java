package com.springrest.springrest.dao;

import com.springrest.springrest.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Long> {
}
