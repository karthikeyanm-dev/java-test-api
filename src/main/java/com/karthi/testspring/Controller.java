package com.karthi.testspring;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping
    public String testApi(){
        return "API is working 👨‍💻🎶";
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
