package org.java10.scs.account.controller;

import org.java10.scs.account.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nil on 2017/11/27.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestClient testClient;

    @RequestMapping("hello")
    public String hello() {
        return testClient.ping();
    }
}
