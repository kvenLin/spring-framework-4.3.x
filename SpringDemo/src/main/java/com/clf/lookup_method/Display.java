package com.clf.lookup_method;

/**
 * @Author: clf
 * @Date: 19-4-3
 * @Description:
 */
public abstract class Display {
    public void display(){
        getCar().display();
    }

    public abstract Car getCar();
}
