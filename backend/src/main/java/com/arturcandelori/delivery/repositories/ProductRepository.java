package com.arturcandelori.delivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturcandelori.delivery.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findAllByOrderByNameAsc();
}
