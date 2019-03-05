package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actorFirst;
    private Actor actorSecond;
    private Actor actorThird;
    private ApplicationContext applicationContext=null;
    private BeanFactory beanFactory=null;

    public Movie()
    {

    }
    public Movie(Actor actorFirst, Actor actorSecond, Actor actorThird) {
        this.actorFirst = actorFirst;
        this.actorSecond = actorSecond;
        this.actorThird = actorThird;
    }

    public Actor getActorFirst() {
        return actorFirst;
    }

    public void setActorFirst(Actor actorFirst) {
        this.actorFirst = actorFirst;
    }

    public Actor getActorSecond() {
        return actorSecond;
    }

    public void setActorSecond(Actor actorSecond) {
        this.actorSecond = actorSecond;
    }

    public Actor getActorThird() {
        return actorThird;
    }

    public void setActorThird(Actor actorThird) {
        this.actorThird = actorThird;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actorFirst=" + actorFirst +
                ", actorSecond=" + actorSecond +
                ", actorThird=" + actorThird +
                '}';
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext Object");
        this.applicationContext=applicationContext;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory Object");
        this.beanFactory=beanFactory;
    }

    public void setBeanName(String beanName) {
        System.out.println("Bean name is :- "+beanName);

    }
}
