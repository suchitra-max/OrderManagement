package com.example.OrderServiceNew.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Long>{

	OrderEntity findById(int id);
	
	OrderEntity findByName(String name);
}
