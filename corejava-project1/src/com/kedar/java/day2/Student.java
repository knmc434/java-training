package com.kedar.java.day2;

import java.util.List;
import java.util.Objects;

public class Student {

    public enum Gender {
        MALE, FEMALE;
    }
    private int studentId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return studentId == student.studentId && age == student.age && studentName.equals(student.studentName) && studentAddress.equals(student.studentAddress)  && gender == student.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentAddress, age,  gender);
    }

    private String studentName;
    private String studentAddress;
    private int age;
    private Department department;
    private List<Subject> subjects;
    private Gender gender;

    public Student(int studentId, String studentName, String studentAddress, int age, Gender gender) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", subjects=" + subjects +
                ", gender=" + gender +
                '}';
    }
}
