package com.medicalcare.test;

import com.medicalcare.user.pojo.UserBaseInfo;
import com.medicalcare.user.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import javax.annotation.Resource;
import javax.swing.*;


/**
 * @author haoshuai
 * @Title: MyTest
 * @ProjectName medicalcare-parent
 * @Description: TODO
 * @date 2018/9/1210:13
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyTest {

    @Resource
    private UserService userService;

    @Test
    public void demo1(){

        UserBaseInfo userBaseInfo=userService.getUserBaseInfo(1);
        System.out.println("我要输出内容了");
        System.out.println(userBaseInfo.getUserName());
        System.out.println("haha");

    }
}

