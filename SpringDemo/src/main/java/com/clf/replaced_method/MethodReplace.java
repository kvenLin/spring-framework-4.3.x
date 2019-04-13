package com.clf.replaced_method;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @Author: clf
 * @Date: 19-4-3
 * @Description:
 */
public class MethodReplace implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("我是替换方法");
        return null;
    }
}
