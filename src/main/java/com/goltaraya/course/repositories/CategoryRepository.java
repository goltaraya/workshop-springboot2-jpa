package com.goltaraya.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goltaraya.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
