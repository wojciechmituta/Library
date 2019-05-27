package com.crud.library.controller;

import com.crud.library.domain.Book;
import com.crud.library.domain.CopyOfBook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/book")
public class BookController {

    @RequestMapping(method = RequestMethod.GET, value = "getAllBooks")
    public Book getAllBooks() {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getBook")
    public Book getBook() {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "addBook")
    public Book addBook() {
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteBook")
    public void deleteBook() {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateBook")
    public Book updateBook() {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getNumbersOfCopy")
    public Long getNumbersOfCopy() {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "addCopy")
    public CopyOfBook addCopy() {
        return null;
    }

}
