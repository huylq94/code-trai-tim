package com.lehuy.codetraitim.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {

    public String getHomePage() {
        return "index";
    }
}
