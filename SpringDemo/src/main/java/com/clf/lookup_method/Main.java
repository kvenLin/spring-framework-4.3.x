package com.clf.lookup_method;

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
        Display display = (Display) context.getBean("display");
        display.display();
    }

    /**
     * 1.当lookup-method方法中指定的是Bmw的Bean时:
     * 输出结果为:我是 BMW
     * 2.当lookup-method方法中指定的是Kia的Bean时:
     * 输出结果为:我是 KIA
     */
}
