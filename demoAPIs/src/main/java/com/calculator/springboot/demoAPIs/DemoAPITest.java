package com.calculator.springboot.demoAPIs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAPITest {

    @GetMapping("/message")
    public String message(){
        return "Hello, This is Springboot!!";
    }

    @GetMapping("/add/{x}/+/{y}")
    public int add(@PathVariable int x, @PathVariable int y){
        return x + y;
    }

    @GetMapping("/subtract/{x}/-/{y}")
    public int subtract(@PathVariable int x, @PathVariable int y){
        return x - y;
    }

    @GetMapping("/multiply/{x}/*/{y}")
    public int multiply(@PathVariable int x, @PathVariable int y){
        return x * y;
    }

    @GetMapping("/divide/{x}///{y}")
    public int divide(@PathVariable int x, @PathVariable int y){
        return x / y;
    }
}
