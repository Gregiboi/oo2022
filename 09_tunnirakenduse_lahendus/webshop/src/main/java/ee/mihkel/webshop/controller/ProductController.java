package ee.mihkel.webshop.controller;

import ee.mihkel.webshop.model.Product;
import ee.mihkel.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("products") // localhost:8080/products   GET
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("products/{index}") // localhost:8080/products/1  GET
    public Product getProduct(@PathVariable Long index) {
        return productRepository.findById(index).get();
    }

    @DeleteMapping("products/{index}") // localhost:8080/products/1 DELETE
    public void deleteProduct(@PathVariable Long index) {
        productRepository.deleteById(index);
    }

    @DeleteMapping("products")  // localhost:8080/products   DELETE
    public String deleteAllProducts() {
        productRepository.deleteAll();
        return "Kõik tooted kustutatud";
    }

    @PostMapping("products") // localhost:8080/products  POST
    public void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PutMapping("products") // localhost:8080/products  PUT
    public void editProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
}
