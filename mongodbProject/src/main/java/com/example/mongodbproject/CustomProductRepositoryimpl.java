package com.example.mongodbproject;

import com.mongodb.client.result.UpdateResult;
import com.mongodb.internal.bulk.UpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;


@Component
public class CustomProductRepositoryimpl implements CustomProductRepository{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void updateProductPrice(String name, double price) {
        Query query = new Query(Criteria.where("title").is(name));
        Update update = new Update();
        update.set("price", price);
        UpdateResult result = mongoTemplate.updateMulti(query, update, Products.class);
        if(result == null) {
            System.out.println("No document updated");
        } else {
            System.out.println(result.getModifiedCount() + " updated successfully");
        }
    }
}
