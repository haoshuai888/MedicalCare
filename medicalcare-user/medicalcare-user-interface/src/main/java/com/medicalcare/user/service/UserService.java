package com.medicalcare.user.service;

import com.medicalcare.user.pojo.UserBaseInfo;

import java.util.List;

/**
 * @author haoshuai
 * @Title: UserService
 * @ProjectName MedicalCare
 * @Description: TODO
 * @date 2018/9/1015:07
 */
public interface UserService{

    /**
     * 根据用户id查询用户基本信息
     * @param userId
     * @return UserBaseInfo
     */
    UserBaseInfo getUserBaseInfo(int userId);
/*
    *
     * 根据用户类添加用户，返回一个String
     * @param userBaseInfo
     * @return

    String addUserBaseInfo(UserBaseInfo userBaseInfo);

    *
     * 更新一条用户记录，返回状态码，200成功，400失败
     * @param userBaseInfo
     * @return

    String updateUser(UserBaseInfo userBaseInfo);

    *
     * 删除一个用户，返回状态码，200成功，400失败
     * @param UserId
     * @return

    String deleteUserByUserId(int UserId);*/
}
