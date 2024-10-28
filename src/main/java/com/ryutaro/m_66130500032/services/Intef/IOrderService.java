//Trin Meesuannil (6613050032)
package com.ryutaro.m_66130500032.services.Intef;

import com.ryutaro.m_66130500032.entities.Customer;
import com.ryutaro.m_66130500032.entities.Order;

import java.util.List;

public interface IOrderService {
    public List<Order> getAlOrder();

    public Order getOrderById(int orderId);

    public List<Order> getAllOrderByCustomer(Customer customer);


}
