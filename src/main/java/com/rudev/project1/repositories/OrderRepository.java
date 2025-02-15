package com.rudev.project1.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rudev.project1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
