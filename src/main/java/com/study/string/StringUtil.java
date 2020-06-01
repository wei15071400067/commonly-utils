package com.study.string;

/**
 * @Description: 字符串工具类
 * @Author: weiyan
 * @CreateDate: 2020/5/22
 */
public class StringUtil {
    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public boolean isEmpty(String str) {
        boolean result = false;
        if (null == str || "".equals(str.replaceAll(" ", ""))) {
            result = true;
        }
        return result;
    }
}
