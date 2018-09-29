package com.composite.utils;

import com.composite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class IUtils {
    @Autowired
    private UserService userService;

    public static IUtils iUtils;

    @PostConstruct
    public void init() {
        iUtils = this;
        iUtils.userService = this.userService;
    }

    public String getValue() {
        String value = userService.getValue();
        return value;
    }

}
