package com.wesley.ProjetoPessoal1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.ProjetoPessoal1.entities.Order;

// não foi colocada anotação por conta de estar herdando 
public interface OrderRepository extends JpaRepository<Order, Long>{

}
