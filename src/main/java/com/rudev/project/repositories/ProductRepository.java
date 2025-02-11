package com.rudev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rudev.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
