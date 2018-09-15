package com.medicalcare.user.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author haoshuai
 * @Title: UserBaseInfo
 * @ProjectName MedicalCare
 * @Description: TODO
 * @date 2018/9/1014:23
 */
public class UserBaseInfo implements Serializable {
    private  int userId;
    private String userName;
    private String userPassword;
    private String userPhone;
    private String userAddress;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "UserBaseInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }
}
