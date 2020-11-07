package com.lu.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        /**
         * method: 要执行的目标对象的方法
         * args: 参数
         * o: 目标对象
         */
        System.out.println(o.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
