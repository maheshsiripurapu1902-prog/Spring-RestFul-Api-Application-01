package com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.entity.Product;
import com.java.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {

	
	@Autowired
	private ProductRepo repo;

	public ProductRepo getRepo() {
		return repo;
	}

	public void setRepo(ProductRepo repo) {
		this.repo = repo;
	}

	@Override
	public Product getInsertingValue(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public void GetInsertingMultipleRecords(List<Product> products) {
		
		
		Iterable<Product>it=repo.saveAll(products);
		it.forEach(pro->{
			System.out.println(pro);
		});
		
	}

	@Override
	public void deletedByid(long id) {

		
		repo.deleteById(id);
	}

	@Override
	public void findSingleRecord(long id) {

		
		Optional<Product>op=repo.findById(id);
		
		System.out.println(op);
	}

	@Override
	public void getdeleteAllRecords() {

		List<Product>list=repo.findAll();
		
		repo.deleteAll(list);
		
	}
	
	
}
