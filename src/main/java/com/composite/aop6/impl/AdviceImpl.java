package com.composite.aop6.impl;

import com.composite.aop6.Advice;

public class AdviceImpl implements Advice {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }
}
