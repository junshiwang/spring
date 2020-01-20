package com.junshi;

import com.junshi.config.AppConfig;
import com.junshi.entity.Person;
import com.junshi.mapper.PersonMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        applicationContext.getBean("a");
    }

    public static void testMyBaties() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // PersonMapper personMapper= sqlSession.getMapper(PersonMapper.class);
        PersonMapper personMapper = (PersonMapper) applicationContext.getBean("personMapper");
        Person[] personList = personMapper.getPersonList();
        System.out.println(personList.length);
        for (Object object : personList) {
            System.out.println(object);
        }
    }

}