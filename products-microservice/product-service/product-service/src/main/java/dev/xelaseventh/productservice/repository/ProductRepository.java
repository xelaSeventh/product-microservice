package dev.xelaseventh.productservice.repository;

import dev.xelaseventh.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
