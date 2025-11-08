package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.entity.Product;
import com.java.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	

	public ProductService getService() {
		return service;
	}

	public void setService(ProductService service) {
		this.service = service;
	}
	
	
	@PostMapping("/product")
	public Product getProductInsertingValue(@RequestBody Product product) {
		
		Product product2=service.getInsertingValue(product);
		
		return product2;
		
		
	}
	
	@PostMapping("/products")
	public void getInsertingMutipleRecords(@RequestBody List<Product>products) {
		
		service.GetInsertingMultipleRecords(products);
	}
	
	
	@DeleteMapping("/product/{id}")
	public void getDeletedSingleRecord(@PathVariable long id) {
		
		service.deletedByid(id);
	}
	
	
	@GetMapping("/productt")
	public void getFindSingleRecord(@RequestParam("id")long id) {
		
		service.findSingleRecord(id);
	}

	
	@DeleteMapping("/all")
	public void getDeleteAllRecords() {
		
		service.getdeleteAllRecords();
	}
}
