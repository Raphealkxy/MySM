package com.timmy.dao;


import com.timmy.po.User;
import javafx.application.Application;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;

import org.junit.Test;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserDaoTest extends SqlSessionDaoSupport implements UserDao {


    public User findUserById(int id) throws Exception {
        SqlSession sqlSession=this.getSqlSession();
        User user=sqlSession.selectOne("test.findUserById",id);
        sqlSession.commit();
        return user;
    }
}
