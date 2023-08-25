package com.layout.hello.controller;

import com.layout.hello.dto.StandardResponseDTO;
import com.layout.hello.requests.TestBody;
import com.layout.hello.services.HelloService;
import com.layout.hello.util.HttpResponseUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    HelloService helloService;

    @ApiOperation(value = "Query By Name")
    @GetMapping("/test/get")
    public StandardResponseDTO testGet(@RequestParam("name") String name) {
        return HttpResponseUtil.success(helloService.testGet(name));
    }

    @ApiOperation(value = "Modify nameById")
    @PostMapping("/test/post")
    public StandardResponseDTO testPost(@RequestBody @Valid TestBody testBody) throws Exception {
        return  HttpResponseUtil.success(helloService.testPost(testBody));
    }
}
