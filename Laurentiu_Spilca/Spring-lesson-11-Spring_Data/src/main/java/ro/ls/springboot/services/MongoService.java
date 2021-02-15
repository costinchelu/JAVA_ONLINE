package ro.ls.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ls.springboot.entities.MongoProduct;
import ro.ls.springboot.repositories.MongoRepo;

@Service
public class MongoService {

    @Autowired
    private MongoRepo mongoRepo;


    public void addProduct(String name) {
        MongoProduct product = new MongoProduct();
        product.setName(name);
        mongoRepo.save(product);
    }
}
