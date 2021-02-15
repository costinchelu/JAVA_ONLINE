package ro.ls.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ls.springboot.services.MongoService;

@RestController
@RequestMapping("/mongo")
public class MongoController {

    @Autowired
    private MongoService mongoService;


    @PostMapping("/add-product/{name}")
    public void addProduct(@PathVariable String name) {
        mongoService.addProduct(name);
    }
}
