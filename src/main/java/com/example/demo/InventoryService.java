package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class InventoryService {

	private Map<Integer, Integer> inventory = new HashMap<>();

	@PostConstruct
	public void init() {
		inventory.put(1, 100);
		inventory.put(2, 200);
		inventory.put(3, 300);
	}

	public int getQty(int prodId) {
		return inventory.getOrDefault(prodId, 0);
	}

	public void updateQty(int prodId, int qty) {
		inventory.put(prodId, qty);
	}

	public Map<Integer, Integer> getInventory() {
		return inventory;
	}
}
