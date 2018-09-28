package com.composite.aop3;

import org.springframework.stereotype.Component;

@Component("strUtil")
public class StrUtil {
    @MyAnno
    public void show() {
        System.out.println("Hello StrUtil!");
    }
}