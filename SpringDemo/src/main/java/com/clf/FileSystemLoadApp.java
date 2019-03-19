package com.clf;

import com.clf.service.ILogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: clf
 * @Date: 19-3-19
 * @Description:
 * FileSystemXmlApplicationContext：
 * 是读取系统文件进行加载配置信息,文件存放路径可以指定为任意系统文件路径,需要使用绝对路径
 */
public class FileSystemLoadApp {
    public static void main(String[] args) {
        /**
         *
         */
        String XMLPath = "//home/hk/IdeaProjects2/spring-framework-4.3.x/SpringDemo/src/main/resources/spring-config.xml";
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(XMLPath);
        ILogin loginService = (ILogin) applicationContext.getBean("loginService");
        loginService.loginCheck("hello world", "123456");
    }
    /**
     * 运行结果：
     * hello world login..., password is 123456
     */
}
