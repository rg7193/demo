package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/api/v1")
public class DemoController {

    @Get("/hello/{name}")
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
