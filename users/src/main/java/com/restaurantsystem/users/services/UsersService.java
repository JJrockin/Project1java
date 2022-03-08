package com.restaurantsystem.users.services;

import java.util.Objects;

import javax.transaction.Transactional;

import com.restaurantsystem.users.dto.Response;
import com.restaurantsystem.users.dto.Signin;
import com.restaurantsystem.users.dto.SigninResponse;
import com.restaurantsystem.users.dto.Signup;
import com.restaurantsystem.users.repositories.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    AuthenticationService authenticationService;

    @Transactional
    public Response signup(Signup signup) {
        //check if user is alrealdy present
        if (Objects.nonNull(UsersRepository.findByEmail(signup.getEmail()))) {
            //we have an user
            throw new CustomException
            
        }
    }

    private Response response;

    public Response signup(Signup signup) {
        return response;
    }

    public SigninResponse signin(Signin signin) {
        return null;
    }
    
}
