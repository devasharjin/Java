package com.example.demo.services;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.example.demo.models.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class ProductServices {
    @Autowired
    ProductRepository repo;
    @Autowired
    CloudinaryServices cloudinaryServices;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product addProduct(Product product, MultipartFile image) {

        try {
            Map uploadResult = cloudinaryServices.uploadImage(image);

            product.setImageUrl(uploadResult.get("secure_url").toString());
            product.setImagePublicId(uploadResult.get("public_id").toString());

            return repo.save(product);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Product getSingleProduct(int id) {
        return repo.findById(id).get();
    }

    public Product updateProduct(int id, Product product, MultipartFile image) {
        Product prod = getSingleProduct(id);
        if(prod==null)
            return null;
        else {
            try {
                Map uploadResult = cloudinaryServices.uploadImage(image);

                product.setImageUrl(uploadResult.get("secure_url").toString());
                product.setImagePublicId(uploadResult.get("public_id").toString());

                return repo.save(product);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void deleteProduct(int id) {
        Product prod = getSingleProduct(id);
        try {
            cloudinaryServices.deleteImage(prod.getImagePublicId());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        repo.deleteById(id);
    }

    public List<Product> searchProduct(String keyword) {
        return repo.searchProducts(keyword);
    }
}
