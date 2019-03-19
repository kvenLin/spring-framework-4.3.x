package com.clf.service;

/**
 * @Author: clf
 * @Date: 19-3-18
 * @Description:
 */
public class LoginImpl implements ILogin{
    @Override
    public void loginCheck(String userName, String password) {
        System.out.println(userName + " login..., password is " + password);
    }
}
