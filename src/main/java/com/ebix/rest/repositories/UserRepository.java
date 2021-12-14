package com.ebix.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebix.rest.entities.User;

// não foi colocada anotação por conta de estar herdando 
public interface UserRepository extends JpaRepository<User, Long>{

}
