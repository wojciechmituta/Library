package com.crud.library.controller;

import com.crud.library.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "getAllUsers")
    public User getAllUsers() {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getUser")
    public User getUser() {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "createUser")
    public User createUser() {
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteUser")
    public void deleteUser() {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateUser")
    public User updateUser() {
        return null;
    }
}
