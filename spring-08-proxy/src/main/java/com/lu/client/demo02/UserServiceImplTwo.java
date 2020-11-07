package com.lu.client.demo02;

// 真实对象
public class UserServiceImplTwo implements UserService{

    public void add() {
        System.out.println("2 增加一个用户");
    }

    public void delete() {
        System.out.println("2 删除一个用户");
    }

    public void update() {
        System.out.println("2 修改一个用户");
    }

    public void query() {
        System.out.println("2 查询一个用户");
    }
}
