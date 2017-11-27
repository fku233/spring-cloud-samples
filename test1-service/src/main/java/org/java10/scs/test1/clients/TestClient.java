package org.java10.scs.test1.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nil on 2017/11/27.
 */
@FeignClient(name="test2-service",fallback = TestClientFallBack.class)
public interface TestClient {

    @GetMapping(value = "/test2/pong")
    String ping();
}
