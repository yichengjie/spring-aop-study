package com.yicj;

import com.yicj.security.CurrentUserHolder;
import com.yicj.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopGuideApplicationTest {

    @Autowired
    private ProductService productService ;

    @Test(expected = RuntimeException.class)
    public void testAnnoDelete(){
        CurrentUserHolder.set("tom");
        productService.delete(1L);
    }

    @Test
    public void testAdminDelete(){
        CurrentUserHolder.set("admin");
        productService.delete(1L);
    }
}
