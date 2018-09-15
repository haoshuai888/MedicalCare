package com.medicalcare.user.service.impl;

import com.alibaba.dubbo.common.json.JSONArray;
import com.medicalcare.user.mapper.UserMapper;
import com.medicalcare.user.pojo.UserBaseInfo;
import com.medicalcare.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haoshuai
 * @Title: UserServiceImpl
 * @ProjectName MedicalCare
 * @Description: TODO
 * @date 2018/9/1015:16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public UserBaseInfo getUserBaseInfo(int userId) {

        UserBaseInfo userBaseInfo = userMapper.getUserByUserId(userId);

        return userBaseInfo;
    }
/*

    @Override
    public String addUserBaseInfo(UserBaseInfo userBaseInfo) {
        String addStatus="0";
        int status=userMapper.addUserByUser(userBaseInfo);
        if(status==1){
            addStatus="200";
        }else {
            addStatus="400";
        }

        //String是不用转
        return addStatus;

    }

    //@RequestParam(value="lid") int id 前台是lid,后台是id
    //@RequestParam(value="id", defaultValue="0")前台可以不传，这时需要默认值。
    @Override
    public String updateUser(int userID) {
        //首先调用查询
        userMapper.getUserByUserId(userID);
        //跳转到修改页面，修改页面要可编辑状态。

        //调用提交，这里不必再调用。

        return null;
    }

    @Override
    public int updateUser(int userId) {
        UserBaseInfo  userBaseInfo= userMapper.getUserByUserId();
        //发送道修改页面


        return null;
    }

    @Override
    public String deleteUserByUserId(int UserId) {
        return null;
    }
*/


}
