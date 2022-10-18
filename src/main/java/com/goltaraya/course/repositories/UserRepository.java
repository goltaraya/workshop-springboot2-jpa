package com.goltaraya.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goltaraya.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
