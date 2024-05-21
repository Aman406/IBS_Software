package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shopping")
public class ShoppingController {

	@Autowired
	private ProductService productService;

	@Autowired
	private InventoryService inventoryService;

	@GetMapping("/products")
	public List<Product> getAllProduct() {
		return productService.getAllProducts();
	}

	@PostMapping("/purchase")
	public String purchaseProduct(@RequestParam int ProdId, @RequestParam int qty) {
		Product prod = productService.getProductById(ProdId);
		if (prod == null)
			return "Product not found as per data";

		int currentQty = inventoryService.getQty(ProdId);
		if (currentQty >= qty) {
			inventoryService.updateQty(ProdId, currentQty - qty);
			return "Product purchase success!!";
		} else {
			return "Insufficient stock avaiable!!";
		}
	}

}
