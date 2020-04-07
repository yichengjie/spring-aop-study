package com.yicj.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * //匹配ProductService类里头的所有方法
 * @Poincut("within(com.yicj.service.ProductService)")
 * //匹配com.yicj包及子包下所有类的方法
 * @Pointcut("within(com.yicj..*)")
 */
@Aspect
@Component
public class PkgTypeAspectConfig {

    @Pointcut("within(com.yicj.service.sub.*)")
    public void matchType(){}

    @Before("matchType()")
    public void before(){

        System.out.println();
        System.out.println("### before");
    }

}
