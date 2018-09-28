package com.composite.aop6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext beanFactory = new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/aop06.xml");
        //配置ProxyFactoryBean
        Advice advice = (Advice) beanFactory.getBean("proxy");
        //配置AutoProxyCreator
        //Advice advice = (Advice) beanFactory.getBean("adviceImpl");
        advice.doSomething();
    }

}
