package com.study.objPool.parameter;

/**
 * @Description: 对象池参数类
 * @Author: weiyan
 * @CreateDate: 2019/10/15
 */
public class ParameterObject {

    private int maxCount;
    private int minCount;

    public ParameterObject(int maxCount, int minCount) {
        this.maxCount = maxCount;
        this.minCount = minCount;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getMinCount() {
        return minCount;
    }

    public void setMinCount(int minCount) {
        this.minCount = minCount;
    }
}
