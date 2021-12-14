package com.ebix.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebix.rest.entities.Product;

// não foi colocada anotação por conta de estar herdando 
public interface ProductRepository extends JpaRepository<Product, Long>{

}
