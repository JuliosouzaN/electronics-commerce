package com.juliosouzaweb.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliosouzaweb.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
