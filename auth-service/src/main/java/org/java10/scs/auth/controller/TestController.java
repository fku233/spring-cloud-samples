package org.java10.scs.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nil on 2017/11/27.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
