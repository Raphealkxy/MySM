package com.timmy.dao;

import com.timmy.mapper.UserMapper;
import com.timmy.po.User;
import com.timmy.po.UserExample;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public interface UserDao{
    public User findUserById(int id) throws Exception;
}
