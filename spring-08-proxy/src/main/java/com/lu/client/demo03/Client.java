package com.lu.client.demo03;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        // 代理角色 暂无
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用程序处理角色来 处理要调用的接口对象
        // host是Rent的实现类
        pih.setRent(host);

        // 通过getProxy方法获得代理，这里proxy是动态生成的
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
