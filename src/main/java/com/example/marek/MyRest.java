package com.example.marek;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class MyRest {

    @PostMapping("/")
    public void rest(@RequestBody MyStuff xxx) {
        System.out.println(xxx);
    }
}
