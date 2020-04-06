package com.yicj.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class MenuService {

    @Cacheable(cacheNames = {"menu"})
    public List<String> getMenuList(){
        System.out.println("");
        System.out.println("mock:get from db");
        return Arrays.asList("article","comment","admin");
    }
}
