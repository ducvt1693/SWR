package com.example.swr302g5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReactAppController {

    @RequestMapping(value = {"/", "/{x:[\\w\\-]+}", "/{x:^(?!api$).*}/{y:[\\w\\-]+}", "/{x:^(?!api$).*}/{y:^(?!api$).*}/{z:[\\w\\-]+}"})
    public String getIndex() {
        return "/index.html";
    }
} 