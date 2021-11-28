package com.wesley.ProjetoPessoal1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.ProjetoPessoal1.entities.Product;

// não foi colocada anotação por conta de estar herdando 
public interface ProductRepository extends JpaRepository<Product, Long>{

}
