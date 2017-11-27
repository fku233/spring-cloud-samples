package org.java10.scs.test2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nil on 2017/11/27.
 */
@RestController
@RequestMapping("pong")
public class PongController {
    @GetMapping("/")
    public String pong() {
        return "pong";
    }
}
