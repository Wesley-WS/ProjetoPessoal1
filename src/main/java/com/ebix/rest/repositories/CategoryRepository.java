package com.ebix.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebix.rest.entities.Category;

// não foi colocada anotação por conta de estar herdando 
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
