package com.goltaraya.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goltaraya.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
