package org.java10.scs.account.client;

import org.springframework.stereotype.Component;

/**
 * Created by nil on 2017/11/27.
 */
@Component
public class TestClientFallBack implements TestClient {
    @Override
    public String ping() {
        System.out.println("auth-service/auth/test服务异常");
        return "auth-service/auth/test服务异常";
    }
}
