package com.pyj.entity;

import java.util.Date;

/**
 * 卖家表
 * Created by pyj on 2019/1/9.
 */
public class Seller {
    /**
     * 卖家表id
     * 和用户表id相同
     */
    private String id;
    /**
     * 用户名
     * 和用户表相同
     */
    private String uName;
    /**
     * 卖家创建时间
     */
    private Date uSTime;

    public Seller() {
    }

    public Seller(String id, String uName, Date uSTime) {
        this.id = id;
        this.uName = uName;
        this.uSTime = uSTime;
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

    public Date getuSTime() {
        return uSTime;
    }

    public void setuSTime(Date uSTime) {
        this.uSTime = uSTime;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id='" + id + '\'' +
                ", uName='" + uName + '\'' +
                ", uSTime=" + uSTime +
                '}';
    }
}
