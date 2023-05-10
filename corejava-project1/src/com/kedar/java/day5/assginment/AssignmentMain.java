package com.kedar.java.day5.assginment;

import com.kedar.java.day2.CollectionSearchExample;
import com.kedar.java.day2.Department;
import com.kedar.java.day2.Student;

import java.util.*;

public class AssignmentMain {

    //List of Students, Subject -> caluclate total marks -> sort them -> top three students
    public static void main(String[] args) {
        List<Student> students = StudentFactory.getStudents();

        //implement comparator based on marks
        Comparator<Student> marksComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getMarks()-o1.getMarks();
            }
        };

        // sort the list
        Collections.sort(students, marksComparator);

        // print top three students
        System.out.println(students);




        //Student -> Subjects  & Department
        //Mech -> Top Three students
        //ECE -> Top three students
        //EEE -> Top Three sudents
        //output will presented in a Map - key -> String(Department),
        Map<String, List<Student>> studentMap = new HashMap<>();
        for(Student student:students) {
            Department department = student.getDepartment();
            Department.DepartmentName departmentName = department.getDepartmentName();
            //Seggregate the list based on department


        }

    }
}
