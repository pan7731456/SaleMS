package com.pyj.entity;

import java.util.Date;

/**
 * 买家表
 * Created by pyj on 2019/1/9.
 */
public class Buyer {
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
     * 买家创建时间
     */
    private Date uBTime;
    /**
     * 买家VIP等级
     * 0 - 无VIP
     */
    private int uBVIP;

    public Buyer() {
    }

    public Buyer(String id, String uName, Date uBTime, int uBVIP) {
        this.id = id;
        this.uName = uName;
        this.uBTime = uBTime;
        this.uBVIP = uBVIP;
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

    public Date getuBTime() {
        return uBTime;
    }

    public void setuBTime(Date uBTime) {
        this.uBTime = uBTime;
    }

    public int getuBVIP() {
        return uBVIP;
    }

    public void setuBVIP(int uBVIP) {
        this.uBVIP = uBVIP;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "id='" + id + '\'' +
                ", uName='" + uName + '\'' +
                ", uBTime=" + uBTime +
                ", uBVIP=" + uBVIP +
                '}';
    }
}
