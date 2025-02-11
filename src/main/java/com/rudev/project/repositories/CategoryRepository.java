package com.rudev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rudev.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
