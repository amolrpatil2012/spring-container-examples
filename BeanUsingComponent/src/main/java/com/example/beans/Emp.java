package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Emp {

    private int empId;
    public String name;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
}
