package com.goltaraya.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goltaraya.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
