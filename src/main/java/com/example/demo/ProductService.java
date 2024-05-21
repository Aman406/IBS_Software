package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class ProductService {

	private List<Product> product = new ArrayList<>();

	@PostConstruct
	public void init() {
		product.add(new Product(1, "Prod 1", 100.0));
		product.add(new Product(2, "Prod 2", 200.0));
		product.add(new Product(3, "Prod 3", 300.0));
	}

	public List<Product> getAllProducts() {
		return product;
	}

	public Product getProductById(int id) {
		return product.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
	}
}
