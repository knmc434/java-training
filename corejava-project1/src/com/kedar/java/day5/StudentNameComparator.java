package com.kedar.java.day5;

import com.kedar.java.day2.Student;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentName().compareTo(o2.getStudentName());
    }
}
