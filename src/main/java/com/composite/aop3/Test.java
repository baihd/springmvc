package com.composite.aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Test {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/aop03.xml");
        IMath math = beanFactory.getBean("math", Math.class);
        int n1 = 100, n2 = 5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);

        StrUtil strUtil = beanFactory.getBean("strUtil", StrUtil.class);
        strUtil.show();
    }

}
