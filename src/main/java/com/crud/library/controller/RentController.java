package com.crud.library.controller;

import com.crud.library.domain.CopyOfBook;
import com.crud.library.domain.Rent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/rent")
public class RentController {

    @RequestMapping(method = RequestMethod.PUT, value = "updateStatus")
    public CopyOfBook updateStatus() {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "addRent")
    public Rent addRent() {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "returnBook")
    public Rent returnBook() {
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteRent")
    public void deleteRent() {

    }

}
