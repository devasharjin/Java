package org.dev.springweb.Controllers;

import org.dev.springweb.Services.ProductServices;
import org.dev.springweb.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductServices productServices;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productServices.getProductList();
    }

    @GetMapping("/product/{prodId}")
    public Product getSingleProduct(@PathVariable int prodId){
        return productServices.getSingleProduct(prodId);
    }

    @PostMapping("/product")
    public void createProduct(@RequestBody Product product){
        productServices.createProduct(product);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product){
        productServices.updateProduct(product);
    }

    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        productServices.deleteProduct(prodId);
    }
}
