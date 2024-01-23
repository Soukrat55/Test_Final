package ma.isga.inventoryservice;

import ma.isga.inventoryservice.entities.Product;
import ma.isga.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("BBB").price(222222).quantite(9).build());
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("MM").price(222222).quantite(9).build());
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("OPP").price(999).quantite(9).build());

		};
	}

}
