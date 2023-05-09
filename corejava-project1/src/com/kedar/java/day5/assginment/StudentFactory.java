package com.kedar.java.day5.assginment;

import com.kedar.java.day2.Student;
import com.kedar.java.day2.Subject;

import java.util.ArrayList;
import java.util.List;

import static com.kedar.java.day2.Student.Gender.FEMALE;
import static com.kedar.java.day2.Student.Gender.MALE;

public class StudentFactory {

    public static List<Student> getStudents() {

        Student studentNo1 = new Student(1, "ram","bangalore", 16, MALE);
        studentNo1.setSubjects(getSubjects(90, 80, 40));

        Student studentNo2 = new Student(2, "ravan","bangalore", 16, MALE);
        studentNo2.setSubjects(getSubjects(20, 50,90));
        Student studentNo3 = new Student(3, "sita", "hyderabad", 12, FEMALE);
        studentNo3.setSubjects(getSubjects(95,95,90));
        Student studentNo4 = new Student(4, "guru", "chennai", 19, MALE);
        studentNo4.setSubjects(getSubjects(80,80,80));
        Student studentNo5 = new Student(5, "hari", "chennai", 19, MALE);
        studentNo5.setSubjects(getSubjects(100,99,99));
        List<Student> studentList = new ArrayList<>();
        studentList.add(studentNo1);


        studentList.add(studentNo2);
        studentList.add(studentNo3);
        studentList.add(studentNo4);
        studentList.add(studentNo5);
        return studentList;
    }

    private static List<Subject> getSubjects(int marks1, int marks2, int marks3) {
        Subject subject1 = new Subject(1, "Maths", marks1);
        Subject subject2 = new Subject(2, "Physics", marks2);
        Subject subject3 = new Subject(3, "Chemistry", marks3);
        List<Subject> subjects = new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        return subjects;
    }
}
