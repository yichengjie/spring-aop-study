package com.yicj.config;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Before("matchAnno()")
 * @After("matchAnno())") //相当于finally
 * @AfterReturning("matchException()")
 * @AfterThrowing("matchException()")
 * @Around("matchException()")
 * @Before(value = "matchLongArg() && args(productId)")
 * public void beforeWithArgs(Long productId)
 * @AfterReturning(value = "matchReturn()",returning = "returnValue")
 * public void getReulst(Object returnValue)
 * Created by cat on 2017-02-19.
 */
@Aspect
@Component
public class AdviceAspectConfig {

    /******pointcut********/

    @Pointcut("@annotation(com.yicj.anno.AdminOnly) && within(com.yicj..*)")
    public void matchAnno(){}

    @Pointcut("execution(* *..find*(Long)) && within(com.yicj..*) ")
    public void matchLongArg(){}

    @Pointcut("execution(public * com.yicj.service..*Service.*(..) throws java.lang.IllegalAccessException) && within(com.yicj..*)")
    public void matchException(){}

    @Pointcut("execution(String com.yicj..*.*(..)) && within(com.yicj..*)")
    public void matchReturn(){}


    /******advice********/
    @Before("matchLongArg() && args(productId)")
    public void before(Long productId){
        System.out.println("###before,get args:"+productId);
    }
//    @Around("matchException()")
//    public java.lang.Object after(ProceedingJoinPoint joinPoint){
//        System.out.println("###before");
//        java.lang.Object result = null;
//        try{
//            result = joinPoint.proceed(joinPoint.getArgs());
//            System.out.println("###after returning");
//        }catch (Throwable e){
//            System.out.println("###ex");
//            //throw
//            e.printStackTrace();
//        }finally {
//            System.out.println("###finally");
//        }
//        return result;
//    }

}
