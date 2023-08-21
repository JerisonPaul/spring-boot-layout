package com.layout.hello.controller;

import com.layout.hello.requests.TestBody;
import com.layout.hello.services.HelloService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    HelloService helloService;

    @ApiOperation(value = "查询接口")
    @GetMapping("/test/get")
    public String testGet(@RequestParam("name") String name) {
        return  helloService.testGet(name);
    }

    @ApiOperation(value = "修改接口")
    @PostMapping("/test/post")
    public String testPost(@RequestBody TestBody testBody) {
        return  helloService.testPost(testBody);
    }
}
