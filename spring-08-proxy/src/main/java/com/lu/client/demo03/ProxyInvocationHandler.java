package com.lu.client.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 用该类自动生成代理
public class ProxyInvocationHandler implements InvocationHandler {
    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成代理类
    public Object getProxy() {
        /**
         * Proxy.newProxyInstance(
         *     this.getClass().getClassLoader(),
         *     接口对象.getClass().getInterfaces(),
         *     this
         * )
         */
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                this
        );
    }

    // 处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质就是使用反射机制来实现
        seeHouse();
        Object invoke = method.invoke(rent, args);
        fare();
        return invoke;
    }

    public void seeHouse() {
        System.out.println("中介带看房子");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
