package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("beans.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        System.out.println(beanFactory.getBean("movie"));
        Movie movie=(Movie)beanFactory.getBean("movie");
        System.out.println(movie);
    }
}
