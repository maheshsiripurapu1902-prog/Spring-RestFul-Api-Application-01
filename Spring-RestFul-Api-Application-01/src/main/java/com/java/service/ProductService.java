package com.java.service;

import java.util.List;

import com.java.entity.Product;

public interface ProductService {

	
	public Product getInsertingValue(Product product);
	
	public void GetInsertingMultipleRecords(List<Product>products);
	
	public void deletedByid(long id);
	
	
	public void findSingleRecord(long id);
	
	
	public void getdeleteAllRecords();
}
