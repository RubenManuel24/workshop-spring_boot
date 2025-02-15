package com.rudev.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rudev.project1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
