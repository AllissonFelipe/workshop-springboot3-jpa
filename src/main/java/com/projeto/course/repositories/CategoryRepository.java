package com.projeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
