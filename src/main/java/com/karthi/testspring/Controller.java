package com.karthi.testspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping
    public String testApi(){
        return "API is working";
    }

    @GetMapping("/id/{id}")
    public String testApi2(@PathVariable String id){
        return "API is working with ID : " +id;
    }

    @GetMapping("/say")
    public String testApi3(@RequestParam String name){
        return "Hi  : "+name;
    }

}
