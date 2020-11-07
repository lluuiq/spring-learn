package com.lu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于<bean id="user" class="com.lu.pojo.User"/>
// 使用 @Component 将该类变为组件
@Component
@Scope("prototype")
public class User {

    // 等价于 <property name="name" value="lluuiq1234"/>
    @Value("lluuiq1234")
    public String name;
}
