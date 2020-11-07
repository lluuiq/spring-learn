package com.lu.client.demo01;

// 代理，帮房东出租房子
public class Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    // 看房
    public void seeHouse() {
        System.out.println("中介带着看房");
    }

    // 收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    // 签合同
    public void hetong() {
        System.out.println("签租赁合同");
    }
}
