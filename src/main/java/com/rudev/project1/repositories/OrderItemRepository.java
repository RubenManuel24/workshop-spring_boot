package com.rudev.project1.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rudev.project1.entities.OrderItem;
import com.rudev.project1.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

