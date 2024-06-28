package me.dio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/teste")
    public String welcome() {
        return "Hello World";
    }
}
