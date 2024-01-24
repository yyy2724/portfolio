package com.example.portfolio;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping({"", "/","/index"})
    public String index(){

        return "index";
    }
}
