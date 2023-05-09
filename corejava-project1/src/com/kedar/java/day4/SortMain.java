package com.kedar.java.day4;

import com.kedar.java.day2.Department;
import com.kedar.java.day2.Student;

import java.util.*;

import static com.kedar.java.day2.Student.Gender.FEMALE;
import static com.kedar.java.day2.Student.Gender.MALE;

public class SortMain {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Oranges");
        fruits.add("Grapes");

        //alphabetical order
        Collections.sort(fruits);

        System.out.println(fruits);

        //Comparator & Comparable
        Set<String> fruitsSet = new TreeSet<>();
        fruitsSet.add("Mango");
        fruitsSet.add("Banana");
        fruitsSet.add("Oranges");
        fruitsSet.add("Grapes");

        System.out.println(fruitsSet);

        Set<Student> studentSet = new TreeSet<>();

        Student studentNo1 = new Student(1, "ram","bangalore", 16, MALE);
        Student studentNo2 = new Student(2, "ravan","bangalore", 16, MALE);
        Student studentNo3 = new Student(3, "sita", "hyderabad", 12, FEMALE);
        Student studentNo4 = new Student(4, "guru", "chennai", 19, MALE);
        Student studentNo5 = new Student(5, "hari", "chennai", 19, MALE);



        Department mechDepartment = new Department();
        mechDepartment.setDepartmentId(1);
        mechDepartment.setDepartmentName(Department.DepartmentName.MECH);

        Department eceDepartment = new Department();
        eceDepartment.setDepartmentId(1);
        eceDepartment.setDepartmentName(Department.DepartmentName.ECE);

        Department eeeDepartment = new Department();
        eeeDepartment.setDepartmentId(3);
        eeeDepartment.setDepartmentName(Department.DepartmentName.EEE);

        studentNo1.setDepartment(mechDepartment);
        studentNo2.setDepartment(mechDepartment);

        studentNo3.setDepartment(eceDepartment);
        studentNo4.setDepartment(eceDepartment);

        studentNo5.setDepartment(eeeDepartment);


        studentSet.add(studentNo1);
        studentSet.add(studentNo2);
        studentSet.add(studentNo3);
        studentSet.add(studentNo4);
        studentSet.add(studentNo5);

        //System.out.println(studentSet.size());

        //System.out.println(studentSet);

       // List<Student> studentList = new ArrayList(studentSet);

        //Collections.sort(studentList);
        //System.out.println(studentList);

        //Comparable or Comparator

        System.out.println(studentSet);
       // System.out.println(studentList.size());
    }
}
