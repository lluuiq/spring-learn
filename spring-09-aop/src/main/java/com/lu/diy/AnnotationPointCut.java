package com.lu.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect // 标注这个类是一个切面
public class AnnotationPointCut {

    @Pointcut("execution(* com.lu.service.UserServiceImpl.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("*******方法执行前********");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("*******方法执行后********");
    }

    // 在环绕增强中，可以给定一个参数，代表我们要获取处理切入的点
    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        // 执行方法
        Object proceed = joinPoint.proceed();
        //String name = joinPoint.getClass().getName();
        //System.out.println(name);
        System.out.println("环绕后");
    }
}
