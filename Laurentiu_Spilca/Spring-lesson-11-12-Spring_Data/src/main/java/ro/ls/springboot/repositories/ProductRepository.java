package ro.ls.springboot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ro.ls.springboot.entities.Product;


@Repository
public interface ProductRepository
        extends JpaRepository<Product, Integer> {


    Product findProductByName(String name);


    @Query("SELECT p FROM Product p WHERE p.name = :name")
    Product jpqlQuery(String name);


    @Query(
            value = "SELECT * FROM products WHERE name = :name",
            nativeQuery = true
    )
    Product sqlQuery(String name);
}
