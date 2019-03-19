package com.clf;

import com.clf.service.ILogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: clf
 * @Date: 19-3-18
 * @Description:
 * ClassPathXmlApplicationContext:
 * 默认从类路径下加载配置文件,即resources文件夹下的spring-config文件
 */
public class ClassPathLoadApp {
    public static void main(String[] args) {
        String XMLPath = "spring-config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(XMLPath);
        ILogin iLogin = (ILogin) applicationContext.getBean("loginService");
        iLogin.loginCheck("clf", "123456");
    }
    /**
     * 运行结果:
     * clf login..., password is 123456
     */
}
