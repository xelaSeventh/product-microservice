package dev.xelaseventh.orderservice.repository;

import dev.xelaseventh.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
