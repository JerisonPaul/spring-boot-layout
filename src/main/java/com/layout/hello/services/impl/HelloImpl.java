package com.layout.hello.services.impl;

import com.layout.hello.model.Hello;
import com.layout.hello.model.repository.HelloRepository;
import com.layout.hello.requests.TestBody;
import com.layout.hello.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service("HelloImpl")
public class HelloImpl implements HelloService {
    @Autowired
    HelloRepository helloRepository;

    public String testGet(String name) {
        Hello hello = helloRepository.findByName(name);
        if (null == hello) return "啥也没找到";
        return "I Am" + hello.getName();
    }

    public String testPost(TestBody testBody) {
        if (StringUtils.isEmpty(testBody.getId()) || StringUtils.isEmpty(testBody.getName())) return "啥也没找到";
        Optional<Hello> hello = helloRepository.findById(testBody.getId());
        if (!hello.isPresent()) return "啥也没找到";
        hello.get().setName(testBody.getName());
        helloRepository.save(hello.get());
        return "I Am " + hello.get().getName();
    }
}
