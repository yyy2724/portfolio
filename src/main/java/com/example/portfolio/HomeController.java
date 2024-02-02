package com.example.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/","/index"})
    public String index(){

        return "index";
    }

    @GetMapping("/project1")
    public String project1(){

        return "/project1";
    }

    @GetMapping("/project2-3")
    public String project23(){

        return "/project2-3";
    }

    @GetMapping("/movingMate")
    public String movingMate(){

        return "/movingMate";
    }
}
