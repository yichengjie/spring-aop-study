package com.yicj.service.sub;

import com.yicj.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class SubService extends ProductService {

    public void demo(){
        System.out.println("execute sub service method");
    }
}
