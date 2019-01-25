package com.pyj.entity;

import java.util.Date;

/**
 * 真实信息表
 * Created by pyj on 2019/1/9.
 */
public class UserInform {
    /**
     * 买家表id
     * 和用户表id相同
     */
    private String id;
    /**
     * 用户名
     * 和用户表相同
     */
    private String uName;
    /**
     * 真实用户姓名
     */
    private String realName;
    /**
     * 用户生日
     */
    private Date birthday;
    /**
     * 用户手机
     */
    private int call;

    public UserInform() {
    }

    public UserInform(String id, String uName, String realName, Date birthday, int call) {
        this.id = id;
        this.uName = uName;
        this.realName = realName;
        this.birthday = birthday;
        this.call = call;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "UserInform{" +
                "id='" + id + '\'' +
                ", uName='" + uName + '\'' +
                ", realName='" + realName + '\'' +
                ", birthday=" + birthday +
                ", call=" + call +
                '}';
    }
}
