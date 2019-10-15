package com.study.objPool.factory;

import com.study.objPool.parameter.ParameterObject;
import com.study.objPool.pool.ObjectPool;

/**
 * @Description: 对象池工厂:用于创建对象池
 * @Author: weiyan
 * @CreateDate: 2019/10/15
 */
public class ObjectPoolFactory {

    private static ObjectPoolFactory objectPoolFactory = new ObjectPoolFactory();
    private static boolean flag = false;

    public static ObjectPoolFactory getInstance() {
        return objectPoolFactory;
    }

    private ObjectPoolFactory() {
        if (false == flag) {
            flag = !flag;
        } else {
            throw new RuntimeException("单例模式正在被攻击");
        }
    }

    public ObjectPool createObjectPool(ParameterObject paraObj, Class clsType){
        return new ObjectPool(paraObj, clsType);

    }
}
