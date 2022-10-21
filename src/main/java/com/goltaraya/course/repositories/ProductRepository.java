package com.goltaraya.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goltaraya.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
