package com.study.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 日期转换工具类
 * @Author: weiyan
 * @CreateDate: 2020/2/2
 */
public class DateUtil {
    public static final String Y_M_D = "yyyy-MM-dd";
    public static final String Y_M_D_H_M_S = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期格式转字符串
     * @param date     要转换日期
     * @param format   转化格式
     * @return
     */
    public String dataToString(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String resultDate = sdf.format(date);
        return resultDate;
    }

    /**
     * 字符串转日期格式
     * @param dateStr     要转换日期
     * @param format   转化格式
     * @return
     */
    public Date stringToData(String dateStr, String format){
        Date resultDate = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            resultDate = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultDate;
    }

    /**
     * 日期字符串转时间戳
     * @param dateStr
     * @param format
     * @return
     */
    public long StringToStamp(String dateStr, String format){
        Date resultDate = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            resultDate = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultDate.getTime();
    }

    /**
     * 获取前多少天时间
     * @param beforeNum   前多少天
     * @return
     */
    public Date getBeforeDay(int beforeNum){
        return new Date(System.currentTimeMillis() - beforeNum * 1000 * 60 * 60 * 24);
    }

}
