package com.today.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.today.service.UserService;
import com.today.vo.User;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了这个类
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class TestUser {

    private static Logger logger = Logger.getLogger(TestUser.class);
    @Resource(name="userServiceImpl")
    private UserService service = null;
    
    @Test
    public void testUser(){
        User user = service.getUserById(1);
        logger.info(user);
        logger.info("user 转为 json");
        logger.info(JSON.toJSONString(user));
    }
    
}
