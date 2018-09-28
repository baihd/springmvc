package com.composite.aop5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//用于表示当前类为容器的配置类，类似<beans/>
@Configuration
//扫描的范围，相当于xml配置的结点<context:component-scan/>
@ComponentScan(basePackages = "com.composite.aop5")
//自动代理，相当于<aop:aspectj-autoproxy proxy-target-class="true"></aop:aspectj-autoproxy>
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationCfg {
    //在配置中声明一个bean，相当于<bean id=getUser class="com.composite.aop05.User"/>
    @Bean
    public User getUser() {
        return new User();
    }
}