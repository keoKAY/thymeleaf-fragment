package com.istad.springthymeleaffragment.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FragmentController {

    @GetMapping("")
    String index(){

        return "index";
    }

    @GetMapping("/allusers")
    String allUsers(Model model){

        List<String> userNames = new ArrayList<>(){{
            add("James");
            add("John") ;
            add("Joe");
            add("Jone");
        }};
        model.addAttribute("users", userNames);

        return "allusers";
    }
}
