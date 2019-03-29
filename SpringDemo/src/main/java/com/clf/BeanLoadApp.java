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
        ClassPathResource resource = new ClassPathResource(XMLPath);
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
    }
}
