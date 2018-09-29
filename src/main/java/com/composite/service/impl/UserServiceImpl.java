package com.composite.service.impl;

import com.composite.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getValue() {
        return "this is userService";
    }
}
