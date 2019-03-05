package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Movie movieA=(Movie)applicationContext.getBean("movieA");
        System.out.println(movieA);
        Movie movieB=(Movie)applicationContext.getBean("movieB");
        System.out.println(movieB);
    }
}
