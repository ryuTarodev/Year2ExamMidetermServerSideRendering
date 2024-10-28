package com.ryutaro.m_66130500032.services.Impl;

import com.ryutaro.m_66130500032.entities.Customer;
import com.ryutaro.m_66130500032.entities.Order;
import com.ryutaro.m_66130500032.repositories.OrderRepository;
import com.ryutaro.m_66130500032.services.Intef.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
//Trin Meesuannil (6613050032)
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAlOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(int orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    public List<Order> getAllOrderByCustomer(Customer customer) {
        return orderRepository.findAllByCustomerOrderByOrderDateAsc(customer);

    }
}
