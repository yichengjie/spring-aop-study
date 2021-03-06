package com.yicj.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * //匹配方法标注有AdminOnly的注解的方法
 * @Pointcut("@annotation(com.imooc.anno.AdminOnly) && within(com.imooc..*)")
 * //匹配标注有NeedSecured的类底下的方法 //class级别
 * @Pointcut("@within(com.imooc.anno.NeedSecured) && within(com.imooc..*)")
 * //匹配标注有NeedSecured的类及其子类的方法 //runtime级别
 * 在spring context的环境下,二者没有区别
 * @Pointcut("@target(com.imooc.anno.NeedSecured) && within(com.imooc..*)")
 * //匹配传入的参数类标注有Repository注解的方法
 * @Pointcut("@args(com.imooc.anno.NeedSecured) && within(com.imooc..*)")
 * Created by cat on 2016-12-04.
 */
@Aspect
@Component
public class AnnoAspectConfig {

    //方法级别
    @Pointcut("@annotation(com.yicj.anno.AdminOnly) && within(com.yicj..*)")
    public void matchMethodAnno(){}

    //类级别
    @Pointcut("@within(com.yicj.anno.NeedSecured) && within(com.yicj..*)")
    public void matchTypeAnno(){ }

    //类级别
    @Pointcut("@target(com.yicj.anno.NeedSecured) && within(com.yicj..*)")
    public void matchTypeAnno2(){ }

    //参数级别
    @Pointcut("@args(com.yicj.anno.NeedSecured) && within(com.yicj..*)")
    public void matchArgAnno(){ }


    @Before("matchArgAnno()")
    public void before(){
        System.out.println("");
        System.out.println("###before");
    }

}