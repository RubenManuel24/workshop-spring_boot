package com.rudev.project1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rudev.project1.entities.Product;
import com.rudev.project1.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAll(){
		List<Product> list = productRepository.findAll();
		return list;	
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
		
	}
	
	

}
