package com.wind.dao;

import com.wind.config.BeanConfig;
import com.wind.entity.Human;
import com.wind.entity.People;
import com.wind.entity.User;
import com.wind.entity.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        // 获取Spring上下文的对象
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans2.xml");
//        ApplicationContext context3 = new ClassPathXmlApplicationContext("beans3.xml");
//        Human human = (Human) context1.getBean("human");
//        People people = context2.getBean("people", People.class);
//        Work work = context3.getBean("work", Work.class);
//        System.out.println(human);
//        System.out.println(people);
//        System.out.println(work);
        ApplicationContext context4 = new AnnotationConfigApplicationContext(BeanConfig.class);
        User user = context4.getBean("getUser", User.class);
        String name = user.getName();
        System.out.println(name);
    }
}
