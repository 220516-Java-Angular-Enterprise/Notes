package com.revature.spring_mvc.web.controllers;

import com.revature.spring_mvc.web.dtos.requests.NewUserRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public @ResponseBody String test1() {
        return "Test1 works!";
    }

    @GetMapping("/test2")
    public @ResponseBody String test2() {
        return "Test2 works!";
    }

    @GetMapping(value = "/test3", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String test3(@RequestParam String s, String t) {
        return s + "\n" + t;
    }

    @PostMapping(value = "/test4", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String test4(@RequestBody NewUserRequest request) {
        if (request.getUsername().equals("bduong0929") && request.getPassword().equals("P@ssw0rd")) return UUID.randomUUID().toString();

        return null;
    }
}
