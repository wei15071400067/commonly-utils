package com.study.thread.constants;

/**
 * @Description: 任务类型枚举类
 * @Author: weiyan
 * @CreateDate: 2019/10/11
 */
public enum JobTypeConstants {
    DEMO_ONE("demo_one","test one"),
    DEMO_TWO("demo_one","test one");

    private String dec;
    private String chinaDec;

    JobTypeConstants(String dec, String chinaDec) {
        this.dec = dec;
        this.chinaDec = chinaDec;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getChinaDec() {
        return chinaDec;
    }

    public void setChinaDec(String chinaDec) {
        this.chinaDec = chinaDec;
    }
}
