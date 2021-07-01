package com.springrest.springrest.Dto;


import com.sun.istack.NotNull;

public class EmployeeDetailsRequestDto {


    @NotNull
    private String name;
    @NotNull
    private String dob;
    private int salary;
    private Long employeeAddressId;

    public Long getEmployeeAddressId() {
        return employeeAddressId;
    }

    public void setEmployeeAddressId(Long employeeAddressId) {
        this.employeeAddressId = employeeAddressId;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        this.name = name;
        return null;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
