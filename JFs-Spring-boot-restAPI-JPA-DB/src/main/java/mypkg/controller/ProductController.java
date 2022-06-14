package mypkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mypkg.entity.Product;
import mypkg.service.ProductService;

@RestController
@Configuration
public class ProductController {
//	@Autowired
	private ProductService service;
	
	@Bean
	public ProductService getservice() {
		this.service = new ProductService();
		return service;
	}

@GetMapping("/prodById/{id}")
public Product findProductById(@PathVariable int id) {
	return service.getProductById(id);
}
	
	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return service.getProducts();
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product p) {
		return service.saveProduct(p);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addproducts(@RequestBody List<Product> ps) {
		return service.saveProducts(ps);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product Product) {
		return service.updateProduct(Product);
	}
}
