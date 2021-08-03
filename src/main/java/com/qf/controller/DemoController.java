package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    //上传代码 再次上传
    @GetMapping("/info")
    public String info(){
        return "Hello qfjy SpringBoot";

    }
}
