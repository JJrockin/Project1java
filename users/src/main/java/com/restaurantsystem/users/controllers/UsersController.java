package com.restaurantsystem.users.controllers;

import com.restaurantsystem.users.dto.Response;
import com.restaurantsystem.users.dto.Signin;
import com.restaurantsystem.users.dto.SigninResponse;
import com.restaurantsystem.users.dto.Signup;
import com.restaurantsystem.users.services.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
    // two apis
    
    // signup

    @Autowired
    UsersService usersService;


    @PostMapping("/signup")
    public Response signup(@RequestBody Signup signup) {
        return usersService.signup(signup);
    }

    //signin
    @PostMapping("/signin")
    public SigninResponse signin(@RequestBody Signin signin) {
        return usersService.signin(signin);
    }
    
        
}

    

