package com.composite.controller;

import com.composite.utils.IUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        String value = IUtils.iUtils.getValue();
        return value;
    }

}
