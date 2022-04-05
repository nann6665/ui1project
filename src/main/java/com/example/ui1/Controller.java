package com.example.ui1;

import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/forside")
    public String first() {
        return "forside";
    }

    @GetMapping("/dinhjælp")
    public String help(){
        return "dinhjælp";
    }
    @GetMapping("/omos")
    public String omOs(){
        return "omos";
    }
}


