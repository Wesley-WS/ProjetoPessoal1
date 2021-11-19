package com.wesley.ProjetoPessoal1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.ProjetoPessoal1.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
