package com.wooly.designpattern._01_Creational_Patterns._05_Prototype;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("111");
        list1.add("222");
        list1.add("333");

        List<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);


    }
}
