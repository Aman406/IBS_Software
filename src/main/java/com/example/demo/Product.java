package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int id;
	private String name;
	private double rate;
	public Product() {}
	 public Product(int id, String name, double rate) {
	        this.id = id;
	        this.name = name;
	        this.rate = rate;
	    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}
