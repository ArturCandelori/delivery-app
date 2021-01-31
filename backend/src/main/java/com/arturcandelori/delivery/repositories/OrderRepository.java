package com.arturcandelori.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturcandelori.delivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
