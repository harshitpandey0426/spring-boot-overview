package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return hello world
    @GetMapping("/")
    public String helloWorld(){
        return "say hello world goooo";
    }

    //expose a new endpoint for workout
    @GetMapping("/workout")
    public String workout(){
        return "run a hard 5k....";
    }
}
