package org.example.aop.controller;

import jakarta.websocket.server.PathParam;
import org.example.aop.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){
        System.out.println("hhhheeee");
        return id + " " + name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){
        return user;
    }
}
