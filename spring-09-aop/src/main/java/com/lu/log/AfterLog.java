package com.lu.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        /**
         * o: 返回值
         * o1: 目标对象
         */
        System.out.println("执行了" + method.getName() + "方法, 返回结果为:" + o);
    }
}
