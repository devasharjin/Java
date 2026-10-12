package org.dev.springweb.Services;

import org.dev.springweb.Repository.ProductRepository;
import org.dev.springweb.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices {
    @Autowired
    ProductRepository repo;

    public List<Product> getProductList(){
        return repo.findAll();
    }

    public Product getSingleProduct(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void createProduct(Product product) {
        repo.save(product);
    }


    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
