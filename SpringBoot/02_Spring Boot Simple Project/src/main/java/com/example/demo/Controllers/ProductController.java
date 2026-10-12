package com.example.demo.Controllers;

import com.example.demo.models.Product;
import com.example.demo.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "[http://localhost:5173](http://localhost:5173)")
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductServices productServices;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productServices.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getSingleProduct(@PathVariable int id){
        return productServices.getSingleProduct(id);
    }

    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String keyword){
        List<Product> products = productServices.searchProduct(keyword);
        System.out.println("Products found: " + products.size());
        return ResponseEntity.ok(products);
    }

    @PostMapping(value ="/product" , consumes = "multipart/form-data")
    public void addProduct(
            @RequestPart("product") Product product,
            @RequestPart("image")MultipartFile image
            ) {

            productServices.addProduct(product,image);
    }

    @PutMapping(value = "/product/{id}" , consumes = "multipart/form-data")
    public void updateProduct(@PathVariable int id, @RequestPart("product") Product product
        , @RequestPart("image") MultipartFile image ){
        productServices.updateProduct(id,product,image);

    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct (@PathVariable int id){
        productServices.deleteProduct(id);
    }

}
