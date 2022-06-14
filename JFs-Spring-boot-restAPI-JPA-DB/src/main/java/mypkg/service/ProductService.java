package mypkg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import mypkg.entity.Product;
import mypkg.repository.ProductRepository;
@Service
@Profile(value = {"abc","testabc"})
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product getProductById(int id) {
		
		return repository.findById(id).orElse(null);
	}
	
	public Product saveProduct(Product p) {
		return repository.save(p);
	}
	
	public List<Product> saveProducts(List<Product> ps) {
		return repository.saveAll(ps);
	}
	
	public List<Product> getProducts() {
		return repository.findAll();
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);	
		return "ID of product removed is" + id;
	}
	
	public Product updateProduct(Product p) {
		System.out.println(p.getId());
		Product prodInDB = repository.findById(p.getId()).orElse(null);
		prodInDB.setQuantity(12);
		prodInDB.setPrice(1899.0);
		return repository.save(prodInDB);
	}
}
