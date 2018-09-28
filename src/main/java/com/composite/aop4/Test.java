package com.composite.aop4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Test {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/aop04.xml");
        Math math = beanFactory.getBean("math", Math.class);
        int n1 = 100, n2 = 0;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        try {
            math.div(n1, n2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
