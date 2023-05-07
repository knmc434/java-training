package com.kedar.java.day3;

import com.kedar.java.day2.Department;
import com.kedar.java.day2.Student;
import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.kedar.java.day2.Student.Gender.FEMALE;
import static com.kedar.java.day2.Student.Gender.MALE;

public class Day3Main {

    public static void main(String[] args) {

        //Array List Contains Example, simple string type

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Banana");
        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.indexOf("Mango"));


        //it will not check object reference, it checks Mango == Mango



        Student student1 = new Student(1, "ram","bangalore", 16, MALE);
        Student student4 = new Student(1, "ram","bangalore", 16, MALE);
        Student student2 = new Student(2, "sita", "hyderabad", 12, FEMALE);
        Student student3 = new Student(3, "hari", "chennai", 19, MALE);
        Student student5 = new Student(3, "hari", "chennai", 19, MALE);



        //Check if Student Presents in Collection, example student ram presents in students list or not
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList.contains(student4));
        System.out.println(studentList.indexOf(student3));
        System.out.println("Size of List:" + studentList.size());
        System.out.println("is Empty "+ studentList.isEmpty());

        if(!studentList.isEmpty()) {
            System.out.println("List is not Empty");
        }



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

        List<Student> students = new ArrayList<>();
        students.add(studentNo1);
        students.add(studentNo2);
        students.add(studentNo3);
        students.add(studentNo4);
        students.add(studentNo5);

        //Find no of students present in each department
        //output should be , mech has 2 students, eee has 1 students, ece has 2 students
        //department, count
        //mech, 2
        //ece, 2
        //eee, 1
        Map<String, Integer>  countMap = new HashMap<>();

        for(Student student: students) {
            Department department = student.getDepartment();
            Department.DepartmentName departmentName = department.getDepartmentName();
            System.out.println("Student "+ student.getStudentName()+" belongs to"+ departmentName);
            String dept = departmentName.toString();
            if(countMap.containsKey(dept)) {
                Integer count = countMap.get(dept);
                count = count+1;
                countMap.put(dept, count);
            } else {
                countMap.put(dept, 1);
            }
        }

        System.out.println(countMap);















    }
}
