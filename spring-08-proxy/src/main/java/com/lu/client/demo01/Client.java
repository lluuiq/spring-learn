package com.lu.client.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        // 代理 ，中介帮房东租房子。代理角色会有一些附属操作
        Proxy proxy = new Proxy(host);

        // Client不用面对房东，直接找中介即可
        proxy.rent();
    }
}
