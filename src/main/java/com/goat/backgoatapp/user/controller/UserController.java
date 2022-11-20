package com.goat.backgoatapp.user.controller;

import com.goat.backgoatapp.user.domain.User;
import com.goat.backgoatapp.user.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public String userJoin(@RequestBody User user){
        userService.join(user);
        return user.getUsername() + " join";
    }

    @RequestMapping("")
    public String getUser(){
        return "user";
    }
}
