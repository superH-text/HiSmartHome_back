package com.HiSmartHome.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

public class CommonUtils {// 把一个Map转换成指定类型的javabean对象
    public static <T> T tobean(Map<String, ?> map, Class<T> clazz) {
        try {
            T bean = clazz.newInstance();
            BeanUtils.populate(bean, map);
            return bean;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
