package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping(value="/helloWorld")
    @ResponseBody
    public String helloWorld()
    {
    	
    	System.out.println("I am in hello");
        return "hello Shivam";
    }
}
