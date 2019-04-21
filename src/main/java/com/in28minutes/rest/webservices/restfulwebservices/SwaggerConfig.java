//package com.in28minutes.rest.webservices.restfulwebservices;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
//                // 为当前包路径
//                .apis(RequestHandlerSelectors.basePackage("com.screw.finance.controller")).paths(PathSelectors.any())
//                .build();
//    }
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                // //大标题
//                .title("财务系统 RESTful API")
//                // 版本号
//                .version("1.0")
////                .termsOfServiceUrl("NO terms of service")
//                // 描述
//                .description("API 描述")
//                //作者
//                .contact(new Contact("cashZhang", "https://blog.csdn.net/m0_37726449", "cashzhang27@qq.com"))
////                .license("The Apache License, Version 2.0")
////                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                .build();
//    }
//
//}
//
