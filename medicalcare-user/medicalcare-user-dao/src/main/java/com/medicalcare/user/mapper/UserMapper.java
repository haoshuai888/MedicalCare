package com.medicalcare.user.mapper;

import com.medicalcare.user.pojo.UserBaseInfo;

import java.util.List;

/**
 * @author haoshuai
 * @Title: UserMapper
 * @ProjectName MedicalCare
 * @Description: TODO
 * @date 2018/9/1014:49
 */
public interface UserMapper {

    /**
     * 根据id查询用户基础信息，一条记录
     * @param userId
     * @return UserBaseInfo
     */
    UserBaseInfo getUserByUserId(int userId);

    /**
     * 查询全部的用户
     * @return List</UserBaseInfo>
     */
    List<UserBaseInfo> getUserListByUSerId();


    /**
     * 根据user对象添加user,返回一个status
     * @param userBaseInfo
     * @return status  200成功，400失败
     */
     int addUserByUser(UserBaseInfo userBaseInfo);


    /**
     * 修改用户，分解为先查询再添加，这里执行添加。
     * @param userBaseInfo
     */
    int updateUserBaseInfo(UserBaseInfo userBaseInfo);


    /**
     * 删除用户，修改userStatus值
     * @param userId
     */
    int deleteUserByUserId(String userId);
}
