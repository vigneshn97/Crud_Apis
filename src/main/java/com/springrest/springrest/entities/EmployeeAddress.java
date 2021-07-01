package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeAddress {

    @Id
    private  Long id;
    private String address;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeAddress{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
