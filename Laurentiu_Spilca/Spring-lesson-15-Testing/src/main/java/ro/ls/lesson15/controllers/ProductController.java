package ro.ls.lesson15.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ro.ls.lesson15.model.Product;

@RestController
public class ProductController {


    @GetMapping("/product/{name}/{price}")
    public Product getProduct(@PathVariable String name, @PathVariable int price) {
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        return p;
    }
}
