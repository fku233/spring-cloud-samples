package org.java10.scs.test1.clients;

import org.springframework.stereotype.Component;

/**
 * Created by nil on 2017/11/27.
 */
@Component
public class TestClientFallBack implements TestClient {
    @Override
    public String ping() {
        System.out.println("服务异常");
        return "服务异常";
    }
}
