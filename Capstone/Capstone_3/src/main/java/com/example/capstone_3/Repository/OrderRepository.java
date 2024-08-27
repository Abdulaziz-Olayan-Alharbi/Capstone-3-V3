package com.example.capstone_3.Repository;

import com.example.capstone_3.Model.Customer;
import com.example.capstone_3.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order findOrderById(Integer id);
    List<Order> findOrderByCustom(Customer customer);
}
