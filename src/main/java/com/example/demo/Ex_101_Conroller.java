package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex_101_Conroller {
        @RequestMapping("/index")
        public String homepage() {

            return "index";
        }
}