package com.kedar.java.day5;

import com.kedar.java.day2.Student;
import com.kedar.java.day2.Subject;

import java.util.*;

import static com.kedar.java.day2.Student.Gender.FEMALE;
import static com.kedar.java.day2.Student.Gender.MALE;

public class ComparatorMain {

    public static void main(String[] args) {

        Student studentNo1 = new Student(1, "ram","bangalore", 16, MALE);
        Student studentNo2 = new Student(2, "ravan","bangalore", 16, MALE);
        Student studentNo3 = new Student(3, "sita", "hyderabad", 12, FEMALE);
        Student studentNo4 = new Student(4, "guru", "chennai", 19, MALE);
        Student studentNo5 = new Student(5, "hari", "chennai", 19, MALE);

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentNo1);
        studentList.add(studentNo2);
        studentList.add(studentNo3);
        studentList.add(studentNo4);
        studentList.add(studentNo5);

        //Collections.sort(studentList, new StudentNameComparator());

        Comparator<Student> ageComparator  = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int count = o1.getAge()-o2.getAge();

                //int count  = o2.getMarks()-o1.getMarks();
                if(count==0) {
                    return o1.getStudentName().compareTo(o2.getStudentName());
                } else {
                    return count;
                }
            }
        };

        Collections.sort(studentList, ageComparator);
        //System.out.println(studentList);

        Set<Student> studentSet = new TreeSet<>(ageComparator);
        studentSet.add(studentNo1);
        studentSet.add(studentNo2);
        studentSet.add(studentNo3);
        studentSet.add(studentNo4);
        studentSet.add(studentNo5);

        System.out.println(studentSet.size());
        System.out.println(studentSet);



    }
}
