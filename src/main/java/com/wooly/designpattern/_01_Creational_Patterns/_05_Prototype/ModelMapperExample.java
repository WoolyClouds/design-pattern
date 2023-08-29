package com.wooly.designpattern._01_Creational_Patterns._05_Prototype;

import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {

        TempModel temp1 = new TempModel();
        temp1.setId("111");
        temp1.setName("aaa");
        System.out.println(temp1);

        TempModel temp2 = new TempModel();
        temp2.setId("222");
        temp2.setName("bbb");
        System.out.println(temp2);

        ModelMapper modelMapper = new ModelMapper();
        TempModel temp3 = modelMapper.map(temp1, TempModel.class);
        System.out.println(temp3);

        TempModel temp4 = new ModelMapper().map(temp2, TempModel.class);
        System.out.println(temp4);
    }
}
