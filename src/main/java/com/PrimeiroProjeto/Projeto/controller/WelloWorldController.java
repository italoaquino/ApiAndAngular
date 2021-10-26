package com.PrimeiroProjeto.Projeto.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class WelloWorldController {

    @RequestMapping("/Word")
    public String HelloWorld(@RequestParam(required = false) String name){
        return "Hello " + (StringUtils.hasText(name) ? name : "World");
    }

}
