package com.study.objPool.factory;

/**
 * @Description: 池化对象工厂
 * @Author: weiyan
 * @CreateDate: 2019/10/15
 */
public class ObjectFactory {
    private static ObjectFactory objectFactory = new ObjectFactory();

    private static boolean flag = false;

    private ObjectFactory() {
        if (false == flag) {
            flag = !flag;
        } else {
            throw new RuntimeException("单例模式正在被攻击");
        }
    }

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    public Object getObject(Class clsType) {
        Object obj = null;
        try {
            obj = clsType.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
