package com.lu.mapper;

import com.lu.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    /**
     * 原来的所有操作都用SqlSession来执行，现在都使用SqlSessionTemplate;
     * @return
     */

    private SqlSessionTemplate sqlSessionTemplate;
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
