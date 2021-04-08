package com.spring.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.spring.server.model.Product;
import com.spring.server.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired ProductRepository productRepository;
	
	@Override
	public Product save(Product product) {
		
		return productRepository.save(product);
	}
	
	@Override
	public Optional<Product> findById(Long id){
		return productRepository.findById(id);
	}
	
	@Override
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	@Override
	public Page<Product> getPageProducts(Pageable pageable){
		return productRepository.getPageProducts(pageable);
	}
}
