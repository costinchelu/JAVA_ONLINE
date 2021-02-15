package ro.ls.springboot.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ro.ls.springboot.entities.MongoProduct;


@Repository
public interface MongoRepo extends MongoRepository<MongoProduct, String> {

}
