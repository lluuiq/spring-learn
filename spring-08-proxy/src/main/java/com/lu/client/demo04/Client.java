package com.lu.client.demo04;

import com.lu.client.demo02.UserService;
import com.lu.client.demo02.UserServiceImpl;
import com.lu.client.demo02.UserServiceImplTwo;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImplTwo userService = new UserServiceImplTwo();
        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置要代理的对象
        pih.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }
}
