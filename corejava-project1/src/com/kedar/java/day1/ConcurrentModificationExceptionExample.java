package com.kedar.java.day1;

import java.util.*;

public class ConcurrentModificationExceptionExample {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apples");
        list.add("oranges");
        list.add("grapes");
        list.add("mangoes");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            //concurrent modification exception
            list.add("Banana");
            System.out.println(iterator.next());
        }

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Oranges");
        stringSet.add("mangoes");
        for(String s: stringSet) {
            stringSet.add("grapes");
            System.out.println("From set"+s);
        }
    }


}
