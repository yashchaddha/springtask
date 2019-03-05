package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy() is called");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean initMethod() is called");
    }
    public void customInit(){
        System.out.println("CustomInit() is called");
    }
    public void customDestroy(){
        System.out.println("CustomDestroy() is called");
    }
}
