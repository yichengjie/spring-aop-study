package com.yicj.service;

import com.yicj.anno.NeedSecured;
import com.yicj.log.Loggable;
import org.springframework.stereotype.Service;

@Service
@NeedSecured
public class ProductService implements Loggable {

    public String getName(){
        System.out.println("execute get name");
        return "product service";
    }

    public void findById(Long id){
        System.out.println("execute find by id");
    }

    public void findByTwoArgs(Long id,String name){
        System.out.println("execute find by id and name");
    }

    @Override
    public void log() {
        System.out.println("log from product service");
    }
}
