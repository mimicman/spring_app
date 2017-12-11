package com.ts.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World !!";
    }
}
