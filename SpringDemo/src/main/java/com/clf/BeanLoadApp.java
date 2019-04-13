package com.clf;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: clf
 * @Date: 19-3-29
 * @Description:
 */
public class BeanLoadApp {
    public static void main(String[] args) {
        String XMLPath = "spring-config.xml";
        //根据xml配置信息创建Resource对象
        ClassPathResource resource = new ClassPathResource(XMLPath);
        //创建一个BeanFactory,即实现一个真正IOC容器
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //XmlBeanDefinitionReader用于读取配置信息,并加载BeanDefinition
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        //开启Bean的载入和注册进程,完成Bean放置在IOC容器中
        reader.loadBeanDefinitions(resource);
    }
}
