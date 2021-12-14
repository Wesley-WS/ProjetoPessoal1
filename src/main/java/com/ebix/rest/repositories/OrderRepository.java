package com.ebix.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebix.rest.entities.Order;

// não foi colocada anotação por conta de estar herdando 
public interface OrderRepository extends JpaRepository<Order, Long>{

}
