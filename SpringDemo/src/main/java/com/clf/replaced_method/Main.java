package com.clf.replaced_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: clf
 * @Date: 19-4-3
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Method method = (Method) context.getBean("method");
        method.display();
    }
    /**
     * 运行结果:
     * 我是替换方法
     */
}
