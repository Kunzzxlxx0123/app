package com.spring.server.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.server.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	
	@Query("SELECT p.id,p.name,p.price,p.number,p.likeCount,p.creator"
			+ ",p.created_date,p.modified_date,p.modifitor FROM Product p")
	Page<Product> getPageProducts(Pageable pageable);
	
	
}
