package ro.ls.springboot.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.UUID;


@Document(collection = "products")
public class MongoProduct {

    @Id
    private String id;

    @Field(name = "name")
    private String name;

    public MongoProduct() {
        id = UUID.randomUUID().toString();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
