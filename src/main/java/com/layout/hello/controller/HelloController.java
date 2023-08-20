package com.layout.hello.controller;

import com.layout.hello.requests.TestBody;
import com.layout.hello.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/test/get")
    public String testGet(@RequestParam("name") String name) {
        return  helloService.testGet(name);
    }

    @PostMapping("/test/post")
    public String testPost(@RequestBody TestBody testBody) {
        return  helloService.testPost(testBody);
    }
}
