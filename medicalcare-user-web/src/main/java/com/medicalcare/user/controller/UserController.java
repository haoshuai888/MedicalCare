package com.medicalcare.user.controller;


import com.medicalcare.user.pojo.UserBaseInfo;
import com.medicalcare.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haoshuai
 * @Title: UserController
 * @ProjectName MedicalCare
 * @Description: TODO
 * @date 2018/9/118:11
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/query")
    @ResponseBody
    public UserBaseInfo getUserBaseInfo(@RequestParam Integer userId){
        System.out.println("番薯数据");
        UserBaseInfo userBaseInfo=userService.getUserBaseInfo(userId);

        return userBaseInfo;
    }


}
