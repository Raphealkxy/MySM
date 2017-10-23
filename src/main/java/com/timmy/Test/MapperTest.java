package com.timmy.Test;

import com.timmy.dao.UserDao;
import com.timmy.mapper.UserMapper;
import com.timmy.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception{
        applicationContext =new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }
    @Test
    public void testFindUserId() throws Exception {
//        UserMapper userMapper= (UserMapper) applicationContext.getBean("userMapper");
//        User user=userMapper.selectByPrimaryKey(1);
//        System.out.println(user);
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        User user=userDao.findUserById(1);
        System.out.println(user);

    }


}
