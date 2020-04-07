package com.yicj;

import com.yicj.service.ProductService;
import com.yicj.service.sub.SubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExecutionApplicationTests {

    @Autowired
    private ProductService productService;

    @Autowired
    private SubService subService;


    @Test
    public void test() {
        System.out.println("###begin test###");
        productService.findById(1L);
        productService.findByTwoArgs(1L,"hello");
        productService.getName();
        subService.demo();
        try {
            productService.exDemo();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
