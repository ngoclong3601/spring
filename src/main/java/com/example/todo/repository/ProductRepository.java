package com.example.todo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.todo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository <Product, String> {
	
}
