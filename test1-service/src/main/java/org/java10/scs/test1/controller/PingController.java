package org.java10.scs.test1.controller;

import org.java10.scs.test1.clients.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nil on 2017/11/27.
 */
@RestController
@RequestMapping("ping")
public class PingController {
    @Autowired
    private TestClient testClient;

    @GetMapping("")
    public String ping() {
        return testClient.ping();
    }
}
