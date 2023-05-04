package com.example.mongodbproject;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Products, String> {

    @Query("{'title': ?0}")
    List<Products> findProductsByTitle(String title);


    @Query("{'type': ?0}")
    List<Products> findProductsByType(String type);


    @Query("{'price': {'$gt': ?0}}")
    List<Products> findProductsByPrice(double price);

    @Query("{$and: [{'price':  {$gt: ?0}} , {'price': {$lt: ?1}} ]}")
    List<Products> findProductsByPriceBetween(double lb, double ub);
}
