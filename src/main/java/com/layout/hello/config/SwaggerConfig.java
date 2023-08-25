package com.layout.hello.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author JerisonPaul
 * @date 2023/8/21 下午11:41
 */
@Configuration
@EnableSwagger2
@Profile(value = {"local", "test"})
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        Contact contact = new Contact("JerisonPaul", "个人链接：", "**");
        return new ApiInfo(
                "Interface Documentation", // 标题
                "", // 描述
                "API：v1.0", // 版本
                "Terms of service", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 ", // 许可
                "http://www.apache.org/", // 许可连接
                new ArrayList<>()// 扩展
        );
    }
}
