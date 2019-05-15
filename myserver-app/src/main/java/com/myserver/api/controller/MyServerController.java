package com.myserver.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 宋长军
 * @date 2019/5/10 8:46
 */
@RestController
public class MyServerController {


    @GetMapping("/test")
    public String test() {

        return "Test success";
    }
}
