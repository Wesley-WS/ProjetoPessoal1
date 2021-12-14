package com.ebix.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebix.rest.entities.OrderItem;

// não foi colocada anotação por conta de estar herdando 
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
