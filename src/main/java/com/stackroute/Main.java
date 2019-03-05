package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie=(Movie)applicationContext.getBean("movie");
//        System.out.println(movie);
//         Movie movie2=(Movie)applicationContext.getBean("movie");
//        System.out.println(movie2);
//        System.out.println(movie==movie2);
        Movie movieA=(Movie)applicationContext.getBean("movieA");
        System.out.println(movieA);
        Movie movieB=(Movie)applicationContext.getBean("movieB");
        System.out.println(movieB);
        System.out.println(movieA==movieB);






    }
}
