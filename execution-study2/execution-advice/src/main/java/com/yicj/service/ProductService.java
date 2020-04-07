package com.yicj.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String getName(){
        System.out.println("execute get name");
        return "product service";
    }

    public void exDemo() throws IllegalAccessError{
        System.out.println("execute ex demo");
    }

    public void findById(Long id){
        System.out.println("execute find by id");
    }

    public void findByTwoArgs(Long id,String name){
        System.out.println("execute find by id and name");
    }


}
