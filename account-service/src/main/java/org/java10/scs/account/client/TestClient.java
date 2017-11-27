package org.java10.scs.account.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nil on 2017/11/27.
 */
@FeignClient(name="auth-service",fallback = TestClientFallBack.class)
public interface TestClient {

    @RequestMapping(value = "/auth/test",method = RequestMethod.GET)
    String ping();
}
