package ro.ls.spring101.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// RestController = Controller + ResponseBody
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
