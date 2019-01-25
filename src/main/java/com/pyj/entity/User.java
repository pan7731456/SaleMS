package com.pyj.entity;

import java.io.Serializable;

/**
 * 用户表
 * Created by pyj on 2019/1/9.
 */
public class User implements Serializable {
    /**
     * 用户id
     */
    private int id;
    /**
     * 用户名
     */
    private String uName;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户类型
     * 0 - 管理员
     * 1 - 买家
     * 2 - 卖家
     */
    private int uType;
    /**
     * 用户状态
     * 0 - 正常
     * 1 - 禁言
     * 2 - 冻结
     */
    private int uStates;


    public User() {
    }

    public User(int id, String uName, String password, int uType, int uStates) {
        this.id = id;
        this.uName = uName;
        this.password = password;
        this.uType = uType;
        this.uStates = uStates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getuType() {
        return uType;
    }

    public void setuType(int uType) {
        this.uType = uType;
    }

    public int getuStates() {
        return uStates;
    }

    public void setuStates(int uStates) {
        this.uStates = uStates;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", uName='" + uName + '\'' +
                ", password='" + password + '\'' +
                ", uType=" + uType +
                ", uStates=" + uStates +
                '}';
    }
}
