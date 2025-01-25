package com.example.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name) {
        return new HelloResponse("Hello," + name + "!");
    }

    @GetMapping("/hello/{name}")
    public HelloResponse helloparam(@PathVariable String name) {
        return new HelloResponse("Hello," + name + "!");
    }
}
