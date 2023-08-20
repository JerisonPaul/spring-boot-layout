package com.layout.hello.services;

import com.layout.hello.requests.TestBody;

public interface HelloService {
    String testGet(String name);
    String testPost(TestBody testBody);
}
