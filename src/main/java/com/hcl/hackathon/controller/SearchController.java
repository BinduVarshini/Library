package com.hcl.hackathon.controller;

import com.hcl.hackathon.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    @GetMapping(path = "/search")
    public List<Book> searchBook(@RequestParam String searchType, @RequestParam String searchQuery) {

        return null;
    }
}
