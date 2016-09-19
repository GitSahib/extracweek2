package edu.mum.volunteers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"/","index.html","index"})
    String index(){
        return "index";
    }
}
