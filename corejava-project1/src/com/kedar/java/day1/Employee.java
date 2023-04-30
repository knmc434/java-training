package com.kedar.java.day1;

import java.util.Objects;

public class Employee {
    private int id;
    private String employeeName;
    private String gender;
    public Employee() {
        super();
    }

    public Employee(int id, String employeeName, String gender) {
        this.id = id;
        this.employeeName = employeeName;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && employeeName.equals(employee.employeeName) && gender.equals(employee.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeName, gender);
    }

}
