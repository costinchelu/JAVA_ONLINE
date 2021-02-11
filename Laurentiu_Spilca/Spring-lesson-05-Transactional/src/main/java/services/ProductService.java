package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * will wrap the method in a transaction. In case we have an exception during this method, then
     * all data will be rolled back in the database
     *
     * rolls back RuntimeException but not checked exception
     */
    @Transactional
    public void addOneProduct(String productName) {
        productRepository.addProduct(productName);
        //if(true) throw  new RuntimeException(":(");
        System.out.println(productName + " was added successfully!");
    }
}
