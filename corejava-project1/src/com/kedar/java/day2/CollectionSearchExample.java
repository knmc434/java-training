package com.kedar.java.day2;

import com.kedar.java.day2.Department;
import com.kedar.java.day2.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.kedar.java.day2.Student.Gender.FEMALE;
import static com.kedar.java.day2.Student.Gender.MALE;

public class CollectionSearchExample {
    public static void main(String[] args) {
        List<String>  fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("grapes");
        fruits.add("banana");
        fruits.add("oranges");

        //search mango is present or not using iterator
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            //u shd not use iterator.next() twice
            String fruit = iterator.next();
            //System.out.println(fruit);
            //mango && MANGO
            if(fruit.equalsIgnoreCase("Mango")) {
               // System.out.println("Mango present in collection");
            }
        }

        // using for loop
        for(String fruit:fruits) {
            if(fruit.equalsIgnoreCase("Mango")) {
                //System.out.println("Mango present in collection");
            }
        }


        //Search  Students age greater than 15 years
        Student student1 = new Student(1, "ram","bangalore", 16, MALE);
        Student student2 = new Student(2, "sita", "hyderabad", 12, FEMALE);
        Student student3 = new Student(3, "hari", "chennai", 19, MALE);
        Department mechDepartment = new Department();
        mechDepartment.setDepartmentId(1);
        mechDepartment.setDepartmentName(Department.DepartmentName.MECH);

        student1.setDepartment(mechDepartment);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        List<Student> students15YearsOldList = new ArrayList<>();
        for(Student student:students) {
            if(student.getAge()>15) {
               // System.out.println(student.getStudentName()+" age greater than 15 years");
                students15YearsOldList.add(student);
            }
        }


       List<Student> first5Students =  students.subList(0,4);

        //Search  Students who belongs to MECH
        List<Student> mechStudents = new ArrayList<>();
        for(Student student:students) {
            //you need to find department of student,
            if( student.getDepartment() != null &&  student.getDepartment().getDepartmentName()==Department.DepartmentName.MECH) {
                System.out.println(student.getStudentName()+" Belongs to Mechanical Dept");
            }
        }
    }
}
