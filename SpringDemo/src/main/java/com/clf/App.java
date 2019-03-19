package com.clf;

import com.clf.service.ILogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: clf
 * @Date: 19-3-18
 * @Description:
 */
public class App {
    public static void main(String[] args) {
        String XMLPath = "//home/hk/IdeaProjects2/spring-framework-4.3.x/SpringDemo/src/main/resources/spring-config.xml";
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(XMLPath);
        ILogin iLogin = (ILogin) applicationContext.getBean("loginService");
        iLogin.loginCheck("clf", "123456");
    }
}
