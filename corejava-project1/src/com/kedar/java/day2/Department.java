package com.kedar.java.day2;

public class Department {

    public enum DepartmentName {
        ECE, MECH, EEE, CSE, IT, IS, BIOTECH;
    }

    private int departmentId;
    private DepartmentName departmentName;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public DepartmentName getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(DepartmentName departmentName) {
        this.departmentName = departmentName;
    }
}
