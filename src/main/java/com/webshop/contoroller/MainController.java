package com.webshop.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public String main() {
        System.out.println("메인페이지");
        return "main";
    }
}
