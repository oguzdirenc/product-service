package com.oguzdirenc.productservice.repository;

import com.oguzdirenc.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
