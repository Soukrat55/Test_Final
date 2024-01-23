package ma.isga.inventoryservice.web;

import ma.isga.inventoryservice.entities.Product;
import ma.isga.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable String id){
        return productRepository.findById(id).get();
    }

}
