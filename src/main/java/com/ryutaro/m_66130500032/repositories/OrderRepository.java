//Trin Meesuannil (6613050032)
package com.ryutaro.m_66130500032.repositories;

import com.ryutaro.m_66130500032.entities.Customer;
import com.ryutaro.m_66130500032.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query("""
        select o from Order o
        where o.customerNumber = ?1
        order by o.orderDate DESC 
    """)
    public List<Order> findAllByCustomerOrderByOrderDateAsc(Customer customer);
}