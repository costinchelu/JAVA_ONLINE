package ro.ls.springbootsql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ls.springbootsql.repositories.ProductRepository;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public void addProduct(String name) {
        productRepository.addProduct(name);
    }
}
