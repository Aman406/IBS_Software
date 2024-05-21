package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Inventory {

	private static Map<Integer, Integer> inventory;
    
	@PostConstruct
	public void init() {
		inventory = new HashMap<>();
	}

	public void addProduct(int prodId, int qty) {
		inventory.put(prodId, qty);
	}

	public void updateQty(int prodId, int qty) {
		inventory.put(prodId, qty);
	}

	public Map<Integer, Integer> getInventory() {
		return inventory;
	}

	public int getQty(int prodId) {
		return inventory.getOrDefault(prodId, 0);
	}
}
