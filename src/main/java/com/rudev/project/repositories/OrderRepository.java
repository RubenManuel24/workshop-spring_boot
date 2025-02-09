package com.rudev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rudev.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
