package com.lm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ZtreeController {

    @GetMapping(value = "/")
    public String ztree(){
        return "ztree";
    }

    @GetMapping(value = "/ztreeTable")
    public String ztreeTable(){
        return "ztreeTable";
    }

    @GetMapping(value = "/example")
    public String example(){
        return "example";
    }

    @GetMapping(value = "/test")
    public String test(){
        return "test";
    }
}
