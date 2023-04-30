package com.kedar.java.day1;

import java.util.*;

public class EqualsAndHashCodeExampleMain {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Mangoes");
        stringSet.add("Grapes");
        stringSet.add("Mangoes");

        List<String> stringList = new ArrayList<>();
        stringList.add("Mangoes");
        stringList.add("Grapes");
        stringList.add("Mangoes");


        Employee employee1 = new Employee(1, "xyz", "male");
        Employee employee3 = new Employee(1, "xyz", "male");
        Employee employee2 = new Employee(2, "abc", "female");

        //Understand the importance of equals and hashcode method
        //difference between equals and ==
        System.out.println(employee1.equals(employee3));
        System.out.println(employee1 == employee3);

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);

        for(Employee employee: employeeSet){
            System.out.println(employee.toString());
        }

        Map<Employee, Employee> employeeMap = new HashMap<>();
        employeeMap.put(employee1, employee1);
        employeeMap.put(employee3, employee2);

        System.out.println("Keys:"+employeeMap.keySet());
        System.out.println("Values:"+employeeMap.values());
    }
}
