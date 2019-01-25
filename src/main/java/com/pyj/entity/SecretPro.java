package com.pyj.entity;

/**
 * 密保表
 * Created by pyj on 2019/1/9.
 */
public class SecretPro {
    /**
     * 密保id
     * 和用户表id相同
     */
    private String id;
    /**
     * 用户手机
     * 和真实姓名表手机相同
     */
    private int call;
    /**
     * 用户不使用手机验证的情况下
     * 密保的第一个问题
     */
    private String firstQuestion;
    /**
     * 密保第一个问题的答案
     */
    private String firstAnswer;
    /**
     * 密保的第二个问题
     */
    private String secondQuestion;
    /**
     * 密保第二个问题的答案
     */
    private String secondAnswer;

    public SecretPro() {
    }

    public SecretPro(String id, int call, String firstQuestion, String firstAnswer, String secondQuestion, String secondAnswer) {
        this.id = id;
        this.call = call;
        this.firstQuestion = firstQuestion;
        this.firstAnswer = firstAnswer;
        this.secondQuestion = secondQuestion;
        this.secondAnswer = secondAnswer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public String getFirstQuestion() {
        return firstQuestion;
    }

    public void setFirstQuestion(String firstQuestion) {
        this.firstQuestion = firstQuestion;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public String getSecondQuestion() {
        return secondQuestion;
    }

    public void setSecondQuestion(String secondQuestion) {
        this.secondQuestion = secondQuestion;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    @Override
    public String toString() {
        return "SecretPro{" +
                "id='" + id + '\'' +
                ", call=" + call +
                ", firstQuestion='" + firstQuestion + '\'' +
                ", firstAnswer='" + firstAnswer + '\'' +
                ", secondQuestion='" + secondQuestion + '\'' +
                ", secondAnswer='" + secondAnswer + '\'' +
                '}';
    }
}
